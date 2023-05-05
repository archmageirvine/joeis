package irvine.oeis.a358;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A358439 Number of even digits necessary to write all positive n-digit integers.
 * a(n) = 5*(9n-1)*10^(n-2).
 * @author Georg Fischer
 */
public class A358439 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A358439() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.FOUR : Z.TEN.pow(mN - 2).multiply(9 * mN - 1).multiply(5);
  }
}
