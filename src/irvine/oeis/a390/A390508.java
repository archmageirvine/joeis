package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a389.A389336;

/**
 * A390508 a(n) = index of the NA-run sequence of the n-th 01-word, where all 01-words are lexicographically ordered (i.e., enumerated) as in A076478; see Comments.
 * @author Sean A. Irvine
 */
public class A390508 extends A390505 {

  private final A390509 mNa = new A390509();
  private final A389336 mCode = new A389336();

  @Override
  public Z next() {
    return Z.valueOf(mCode.decode(mNa.nextNa().toString()));
  }
}
