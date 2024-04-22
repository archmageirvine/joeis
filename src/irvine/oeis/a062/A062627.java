package irvine.oeis.a062;
// manually simple/simbinom at 2023-03-20 17:26

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A062627 a(n) = mu(n) * Catalan(n).
 * @author Georg Fischer
 */
public class A062627 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A062627() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Functions.CATALAN.z((long) mN).multiply(Functions.MOBIUS.i((long) mN));
  }
}
