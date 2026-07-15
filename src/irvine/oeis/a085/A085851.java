package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A085851 Decimal expansion of hard hexagon entropy constant.
 * @author Sean A. Irvine
 */
public class A085851 extends PolynomialRootExpansionSequence {

  private static final Polynomial<Z> POLY = Polynomial.create(new Z("-32751691810479015985152"),
    Z.ZERO,
    Z.ZERO,
    Z.ZERO,
    new Z("97143135277377575190528"),
    Z.ZERO,
    new Z("-73347491183630103871488"),
    Z.ZERO,
    new Z("-71220809441400405884928"),
    Z.ZERO,
    new Z("107155448150443388043264"),
    Z.ZERO,
    new Z("-72405670285649161617408"),
    Z.ZERO,
    new Z("2958015038376958230528"),
    Z.ZERO,
    new Z("7449488310131083100160"),
    Z.ZERO,
    new Z("797726698866658379776"),
    Z.ZERO,
    new Z("2505062311720673792"),
    Z.ZERO,
    new Z("2013290651222784"),
    Z.ZERO,
    new Z("25937424601"));

  /** Construct the sequence. */
  public A085851() {
    super(1, POLY, CR.ONE, CR.TWO);
  }
}

