package irvine.oeis.a328;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a035.A035100;

/**
 * A328659 Partial sums of A035100: number of binary digits of the primes.
 * @author Georg Fischer
 */
public class A328659 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A328659() {
    super(new A035100());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
