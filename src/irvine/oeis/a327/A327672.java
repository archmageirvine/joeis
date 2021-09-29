package irvine.oeis.a327;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003059;

/**
 * A327672 a(n) = Sum_{k=0..n} ceiling(sqrt(k)).
 * @author Georg Fischer
 */
public class A327672 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A327672() {
    super(new A003059());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
