package irvine.math.r;

/**
 * Various double precision physical constants.
 *
 * @author Sean A. Irvine
 */
public final class PhysicsConstants {

  private PhysicsConstants() { }

  private static double errorMultiply(final double v1, final double u1, final double v2, final double u2) {
    final double mpR = u1 / v1;
    final double meR = u2 / v2;
    final double e = mpR + meR;
    return e * v1 * v2;
  }

  private static double errorDivide(final double v1, final double u1, final double v2, final double u2) {
    final double mpR = u1 / v1;
    final double meR = u2 / v2;
    final double e = mpR + meR;
    return e * v1 / v2;
  }

  /** Speed of light in vacuum in m/s. An exact value. */
  public static final long SPEED_OF_LIGHT = 299792458;
  /** Magnetic constant, mu_0, 4 * pi * 10^-7 in N/A^2. */
  public static final double MAGNETIC_CONSTANT = Constants.TAU * 2E-7;
  /** Electric constant, epsilon_0, 1/mu_0 c^2 in F/m. */
  public static final double ELECTRIC_CONSTANT = 1 / MAGNETIC_CONSTANT / SPEED_OF_LIGHT / SPEED_OF_LIGHT;
  /** Characteristic impedance of vacuum, Z_0 = mu_0 c in ohms. */
  public static final double CHARACTERISTIC_IMPEDANCE_OF_VACUUM = MAGNETIC_CONSTANT * SPEED_OF_LIGHT;

  /** Newtonian gravitation constant, G, in m^3 kg^-1 s^-2. */
  public static final double GRAVITATION_CONSTANT     = 6.67408E-11;
  /** Uncertainty in Newtonian gravitation constant, G, in m^3 kg^-1 s^-2. */
  public static final double GRAVITATION_CONSTANT_UNC = 0.00031E-11;

  /** Planck constant in J s. */
  public static final double PLANCK_CONSTANT     = 6.626070040E-34;
  /** Uncertainty in Planck constant in J s. */
  public static final double PLANCK_CONSTANT_UNC = 0.000000081E-34;
  /** Planck constant over tau. */
  public static final double HBAR = PLANCK_CONSTANT / Constants.TAU;
  /** Uncertainty in Planck constant over tau. */
  public static final double HBAR_UNC = PLANCK_CONSTANT_UNC / Constants.TAU;

  /** Charge of an electron, e, in C. */
  public static final double ELEMENTARY_CHARGE     = 1.6021766208E-19;
  /** Uncertainty in charge of an electron, e, in C. */
  public static final double ELEMENTARY_CHARGE_UNC = 0.0000000098E-19;

  /** Magnetic flux quantum Phi_0 in Wb */
  public static final double MAGNETIC_FLUX_QUANTUM = PLANCK_CONSTANT / ELEMENTARY_CHARGE / 2;
  /** Uncertainty in magnetic flux quantum Phi_0 in Wb */
  public static final double MAGNETIC_FLUX_QUANTUM_UNC = 0.5 * errorDivide(PLANCK_CONSTANT, PLANCK_CONSTANT_UNC, ELEMENTARY_CHARGE, ELEMENTARY_CHARGE_UNC);

  /** Conductance quantum G_0 in S. */
  public static final double CONDUCTANCE_QUANTUM = 2 * ELEMENTARY_CHARGE * ELEMENTARY_CHARGE / PLANCK_CONSTANT;
  /** Uncertainty in conductance quantum G_0 in S. */
  public static final double CONDUCTANCE_QUANTUM_UNC = 2 * errorDivide(ELEMENTARY_CHARGE * ELEMENTARY_CHARGE, errorMultiply(ELEMENTARY_CHARGE, ELEMENTARY_CHARGE_UNC, ELEMENTARY_CHARGE, ELEMENTARY_CHARGE_UNC), PLANCK_CONSTANT, PLANCK_CONSTANT_UNC);

  /** The fine structure constant, alpha. */
  public static final double FINE_STRUCTURE_CONSTANT     = 7.2973525664E-3;
  /** Uncertainty in the fine structure constant. */
  public static final double FINE_STRUCTURE_CONSTANT_UNC = 0.0000000017E-3;

  /** Rydberg constant in m^-1. */
  public static final double RYDBERG = 10973731.568508;
  /** Uncertainty in Rydberg constant in m^-1. */
  public static final double RYDBERG_UNC    = 0.000065;

  /** Avogadro constant, N_A, in mol^-1. */
  public static final double AVOGADRO =     6.022140857E23;
  /** Uncertainty in Avogadro constant, N_A, in mol^-1. */
  public static final double AVOGADRO_UNC = 0.000000074E23;

  /** Faraday constant, C / mol. */
  public static final double FARADAY = AVOGADRO * ELEMENTARY_CHARGE;
  /** Uncertainty in Faraday constant, C / mol. */
  public static final double FARADAY_UNC = errorMultiply(AVOGADRO, AVOGADRO_UNC, ELEMENTARY_CHARGE, ELEMENTARY_CHARGE_UNC);

  /** Molar gas constant in J mol^-1 K^-1. */
  public static final double MOLAR_GAS     = 8.3144598;
  /** Uncertainty in molar gas constant in J mol^-1 K^-1. */
  public static final double MOLAR_GAS_UNC = 0.0000048;

  /** Boltzmann constant, k, in J/K. */
  public static final double BOLTZMANN     = 1.38064852E-23;
  /** Uncertainty in Boltzmann constant, k, in J/K. */
  public static final double BOLTZMANN_UNC = 0.00000079E-23;

  /** Stefan-Boltzmann constant, sigma, in W m^-2 K^-4. */
  public static final double STEFAN_BOLTZMANN     = 5.670367E-8;
  /** Uncertainty in Stefan-Boltzmann constant, sigma, in W m^-2 K^-4. */
  public static final double STEFAN_BOLTZMANN_UNC = 0.000013E-8;

  /** Planck mass, kg. */
  public static final double PLANCK_MASS = Math.sqrt(HBAR * SPEED_OF_LIGHT / GRAVITATION_CONSTANT);
  /** Uncertainty in Planck mass, kg. */
  public static final double PLANCK_MASS_UNC = 0.000051E-8;

  /** Mass of electron in mass units. */
  public static final double ELECTRON_MASS     = 5.48579909070E-4;
  /** Uncertainty of mass of electron in mass units. */
  public static final double ELECTRON_MASS_UNC = 0.00000000016E-4;

  /** Mass of proton in mass units. */
  public static final double PROTON_MASS       = 1.007276466879;
  /** Uncertainty of mass of proton in mass units. */
  public static final double PROTON_MASS_UNC   = 0.000000000091;

  /** Mass of neutron in mass units. */
  public static final double NEUTRON_MASS      = 1.00866491588;
  /** Uncertainty of mass of neutron in mass units. */
  public static final double NEUTRON_MASS_UNC  = 0.00000000049;

  /** Mass unit in kg. */
  public static final double MASS_UNIT =     1.660539040E-27;
  /** Uncertainty in mass unit to kg conversion. */
  //public static final double MASS_UNIT_UNC = 0.000000020E-27;

  /** Bohr radius in metres. */
  public static final double BOHR_RADIUS     = 0.52917721067E-10;
  /** Uncertainty in Bohr radius in metres. */
  public static final double BOHR_RADIUS_UNC = 0.00000000012E-10;

  /**
   * Convert from mass units to kilograms.
   * @param x mass in mass units
   * @return mass in kilograms
   */
  public static double u2kg(final double x) {
    return x * MASS_UNIT;
  }
}
