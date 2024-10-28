package irvine.math.cr.functions;

/**
 * A collection of functions defined over the constructible reals.
 * @author Sean A. Irvine
 */
public final class CrFunctions {

  private CrFunctions() {
  }

  /** The complete elliptic K function. */
  public static final CrFunction1 ELLIPTIC_K = new EllipticK();
  /** The complete elliptic E function. */
  public static final CrFunction1 ELLIPTIC_E = new EllipticE();
  /** The bessel I0 function. */
  public static final CrFunction1 BESSEL_I0 = new BesselI0();
  /** The bessel J0 function. */
  public static final CrFunction1 BESSEL_J0 = new BesselJ0();
  /** The bessel K0 function. */
  public static final CrFunction1 BESSEL_K0 = new BesselK0();
  /** The bessel Y0 function. */
  public static final CrFunction1 BESSEL_Y0 = new BesselY0();
  /** The bessel I function. */
  public static final CrFunction2 BESSEL_I = new BesselI();
  /** The bessel I function. */
  public static final CrFunction2 BESSEL_K = new BesselK();
}
