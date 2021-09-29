package irvine.oeis.a218;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001822;

/**
 * A218443 a(n) = Sum_{k=0..n} floor(n/(3k+2)).
 * @author Georg Fischer
 */
public class A218443 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A218443() {
    super(new A001822());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
