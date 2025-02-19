package irvine.oeis.a248;
// Generated by gen_seq4.pl floorr at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A248421 a(n) = floor( 1/(n*tan(Pi/n) - Pi) ).
 * @author Georg Fischer
 */
public class A248421 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  /** Construct the sequence. */
  public A248421() {
    super(3);
  }

  protected Z evalCR(final long n) {
    return CR.ONE.divide(CR.valueOf(n).multiply(REALS.tan(CR.PI.divide(CR.valueOf(n)))).subtract(CR.PI)).floor();
  }

}
