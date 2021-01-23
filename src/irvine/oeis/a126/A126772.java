package irvine.oeis.a126;
// manually 2021-01-20

import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A126772 Padovan factorials: a(n) is the product of the first n terms of the Padovan sequence. Similar to the Fibonacci factorial.
 * @author Georg Fischer
 */
public class A126772 extends A000931 {

  protected Z mFact;

  /** Construct the sequence. */
  public A126772() {
    for (int i = 0; i <= 4; ++i) {
      super.next();
    }
    mFact = Z.ONE;
  }

  @Override
  public Z next() {
    mFact = mFact.multiply(super.next());
    return mFact;
  }
}
