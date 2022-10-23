package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036331 Composite numbers n such that juxtaposition of prime factors of n has length 7.
 * @author Sean A. Irvine
 */
public class A036331 extends Sequence1 {

  private TreeSet<Z> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = A036328.build(7);
    }
    return mA.isEmpty() ? null : mA.pollFirst();
  }
}
