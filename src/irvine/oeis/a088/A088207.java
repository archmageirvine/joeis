package irvine.oeis.a088;
// manually partsum at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001950;

/**
 * A088207 a(n) = Sum_{k=0..n} floor(k*phi^2)) where phi=(1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A088207 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A088207() {
    super(new A001950());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
