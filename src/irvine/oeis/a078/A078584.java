package irvine.oeis.a078;
// manually diffseq at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a077.A077133;

/**
 * A078584 a(n) = prime(2n) - prime(2n-1).
 * @author Georg Fischer
 */
public class A078584 extends DifferenceSequence {

  protected long mN = 0;

  /** Construct the sequence. */
  public A078584() {
    super(new A077133());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ONE : super.next();
  }
}
