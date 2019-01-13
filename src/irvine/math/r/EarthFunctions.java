package irvine.math.r;

/**
 * Various functions to compute planetary information.
 *
 * @author Sean A. Irvine
 */
public final class EarthFunctions  {

  private EarthFunctions() { }

  /** Sea-level temperature */
  private static final double TEMPSL = 518.67;
  /** Sea-level pressure */
  private static final double PRESSSL = 2116.22;
  /** Sea-level rho value */
  private static final double RHOSL = 0.00237689;
  /** Absolute zero in degrees Celsius */
  private static final double ABSOLUTE_ZERO = -273.15;

  /**
   * Convert from degrees Celsius to kelvin.
   * @param celsius temperature in degrees Celsius
   * @return temperature in kelvin
   */
  public static double celsiusToKelvin(final double celsius) {
    return celsius - ABSOLUTE_ZERO;
  }

  /**
   * Compute quantities in the ICAO Standard Atmosphere for a specified
   * altitude. Returns an array of doubles, these values are in order:
   * the temperature in Kelvin, the rho value (density) in kg/m^3,
   * the pressure in N/m^2, viscosity Ns/m^2, the speed of sound m/s,
   * Reynolds number, turbulence coefficient, and laminar coefficient.
   *
   * @param altitude height above sea-level in metres
   * @return atmospheric quantities as detailed above
   */
  public static double[] isa(double altitude) {

   double saTheta = 1.0;
   double saSigma = 1.0;
   double saDelta = 1.0;

   altitude *= 3.2808; // convert to ft

   if (altitude > 232939.0) {
     saTheta = 0.0;
     saSigma = 0.0;
     saDelta = 0.0;
   } else if (altitude < 36089.0) {
     saTheta = 1.0 - altitude / 145442.0;
     saSigma = Math.pow(1.0 - altitude / 145442.0, 4.255876);
     saDelta = Math.pow(1.0 - altitude / 145442.0, 5.255876);
   } else if (altitude < 65617.0) {
     saTheta = 0.751865;
     final double t = Math.exp((36089.0 - altitude) / 20806.0);
     saSigma = 0.297076 * t;
     saDelta = 0.223361 * t;
   } else if (altitude < 104987.0) {
     saTheta = 0.682457 + altitude / 945374;
     saSigma = Math.pow(0.978261 + altitude / 659515.0, -35.16319);
     saDelta = Math.pow(0.988626 + altitude / 652600.0, -34.16319);
   } else if (altitude < 154199.0) {
     saTheta = 0.482561 + altitude / 337634.0;
     saSigma = Math.pow(0.857003 + altitude / 190115.0, -13.20114);
     saDelta = Math.pow(0.898309 + altitude / 181373.0, -12.20114);
   } else if (altitude < 167323.0) {
     saTheta = 0.939268;
     final double t = Math.exp((altitude - 154200.0) / -25992.0);
     saSigma = 0.00116533 * t;
     saDelta = 0.00109456 * t;
   } else if (altitude < 232940.0) {
     saTheta = 1.434843 - altitude / 337634;
     saSigma = Math.pow(0.79899 - altitude / 606330, 11.20114);
     saDelta = Math.pow(0.838263 - altitude / 577922, 12.20114);
   }

   final double tempVal = TEMPSL * saTheta;
   final double rhoVal = RHOSL * saSigma;
   final double viscVal = 0.0000000226968 * Math.pow(tempVal, 1.5) / (tempVal + 198.72);
   final double reynoldsVal = 3.2808 * 3.2808 * rhoVal / viscVal;
   return new double[] {
     tempVal / 1.8,
     rhoVal / 0.068521 / 0.028317,
     PRESSSL * saDelta / 0.020885,
     viscVal / 0.22481 / 0.092903,
     Math.sqrt(1.4 * 1716.56 * tempVal) / 3.2808,
     reynoldsVal,
     0.455 / Math.pow(Math.log(reynoldsVal) / Math.log(10.0), 2.58),
     1.328 / Math.sqrt(reynoldsVal)
   };
  }

  /**
   * Return the pressure of water vapour over ice according to the
   * Goff Gratch equation.
   *
   * @param temperature temperature in kelvin
   * @return water vapour pressure in hectopascals
   */
  public static double waterVapourPressureOverIce(final double temperature) {
    final double t1 = 273.16 / temperature;
    return Math.pow(10.0, -9.09718 * (t1 - 1.0) - 3.56654 * Math.log(t1) * Constants.INV_LN10 + 0.876793 * (1.0 - temperature / 273.16) + Math.log(6.1071) * Constants.INV_LN10);
  }

  /**
   * Return the pressure of water vapour over water according to the
   * Goff Gratch equation.
   *
   * @param temperature temperature in kelvin
   * @return water vapour pressure in hectopascals
   */
  public static double waterVapourPressureOverWater(final double temperature) {
    final double t1 = 373.16 / temperature;
    return Math.pow(10.0, -7.90298 * (t1 - 1.0) + 5.02808 * Math.log(t1) * Constants.INV_LN10 - 1.3816E-7 * (Math.pow(10.0, 11.344 * (1.0 - temperature / 273.16)) - 1.0) + 8.1328E-3 * (Math.pow(10.0, -3.49149 * (t1 - 1.0)) - 1.0) + 3.005714898);
  }

  /**
   * Return the saturation pressure of water vapour according to
   * the ASAE standard. Valid for 273.16 to 533.15 kelvin.
   *
   * @param temperature temperature in kelvin
   * @return water vapour pressure in pascals
   */
  public static double waterVapourPressure(final double temperature) {
    final double t2 = temperature * temperature;
    final double t3 = t2 * temperature;
    final double t4 = t3 * temperature;
    return 22105649.25 * Math.exp((-27405.526 + 97.5413 * temperature - 0.146244 * t2 + 0.12558E-3 * t3 - 0.48502E-7 * t4) / (4.34903 * temperature - 0.39381E-2 * t2));
  }

  /**
   * Compute the reduction of saturated gas volume to body temperature
   * (37 degrees C). That is, a conversion factor of spirometer values
   * to lung values.
   *
   * @param pressure pressure in Pa
   * @param temperature temperature in K
   * @return conversion factor
   */
  public static double reductionSaturatedGasVolumeToBodyTemperature(final double pressure, final double temperature) {
    return 1.13579 * (pressure - waterVapourPressure(temperature)) / ((pressure - waterVapourPressure(310.15)) * (1.0 + (temperature + ABSOLUTE_ZERO) * 0.003670));
  }

  /**
   * Reduction in dry gas volume at given pressure and temperature.
   *
   * @param pressure pressure in Pa
   * @param temperature temperature in K
   * @return conversion factor
   */
  public static double reductionDryGasVolume(final double pressure, final double temperature) {
    return pressure / (760.0 * 133.322 * (1.0 + 0.003670 * (temperature + ABSOLUTE_ZERO)));
  }

  /**
   * Reduction in water saturated gas volume at given pressure and temperature.
   *
   * @param pressure pressure in Pa
   * @param temperature temperature in K
   * @return conversion factor
   */
  public static double reductionSaturatedGasVolume(final double pressure, final double temperature) {
    return (pressure - waterVapourPressure(temperature)) / (760.0 * 133.322 * (1.0 + 0.003670 * (temperature + ABSOLUTE_ZERO)));
  }

}
