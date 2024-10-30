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
  /** The Airy Ai function. */
  public static final CrFunction1 AIRY_AI = new AiryAi();
  /** The Airy Bi function. */
  public static final CrFunction1 AIRY_BI = new AiryBi();
  /** The Neville <code>theta_c</code> function. */
  public static final CrFunction2Cr NEVILLE_THETA_C = new NevilleThetaC();
  /** The Neville <code>theta_d</code> function. */
  public static final CrFunction2Cr NEVILLE_THETA_D = new NevilleThetaD();
  /** The Neville <code>theta_n</code> function. */
  public static final CrFunction2Cr NEVILLE_THETA_N = new NevilleThetaN();
  /** The Neville <code>theta_s</code> function. */
  public static final CrFunction2Cr NEVILLE_THETA_S = new NevilleThetaS();
  /** The Jacobi cd function. */
  public static final CrFunction2Cr JACOBI_CD = new JacobiCd();
  /** The Jacobi cn function. */
  public static final CrFunction2Cr JACOBI_CN = new JacobiCn();
  /** The Jacobi cs function. */
  public static final CrFunction2Cr JACOBI_CS = new JacobiCs();
  /** The Jacobi dc function. */
  public static final CrFunction2Cr JACOBI_DC = new JacobiDc();
  /** The Jacobi dn function. */
  public static final CrFunction2Cr JACOBI_DN = new JacobiDn();
  /** The Jacobi ds function. */
  public static final CrFunction2Cr JACOBI_DS = new JacobiDs();
  /** The Jacobi nc function. */
  public static final CrFunction2Cr JACOBI_NC = new JacobiNc();
  /** The Jacobi nd function. */
  public static final CrFunction2Cr JACOBI_ND = new JacobiNd();
  /** The Jacobi ns function. */
  public static final CrFunction2Cr JACOBI_NS = new JacobiNs();
  /** The Jacobi sc function. */
  public static final CrFunction2Cr JACOBI_SC = new JacobiSc();
  /** The Jacobi sd function. */
  public static final CrFunction2Cr JACOBI_SD = new JacobiSd();
  /** The Jacobi sn function. */
  public static final CrFunction2Cr JACOBI_SN = new JacobiSn();
}
