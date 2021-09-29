package irvine.oeis.a218;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001817;

/**
 * A218442 a(n) = Sum_{k=0..n} floor(n/(3*k + 1)).
 * @author Georg Fischer
 */
public class A218442 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A218442() {
    super(new A001817());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
