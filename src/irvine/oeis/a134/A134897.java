package irvine.oeis.a134;
// Generated by gen_seq4.pl floorr at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A134897 Floor(n*exp(cot n)).
 * @author Georg Fischer
 */
public class A134897 extends FloorSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  /** Construct the sequence. */
  public A134897() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(REALS.cot(CR.valueOf(n)).exp()).floor();
  }

}
