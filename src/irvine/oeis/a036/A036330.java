package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036330 Composite numbers n such that juxtaposition of prime factors of n has length 6.
 * @author Sean A. Irvine
 */
public class A036330 implements Sequence {

  private TreeSet<Z> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = A036328.build(6);
    }
    return mA.isEmpty() ? null : mA.pollFirst();
  }
}
