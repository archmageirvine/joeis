package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036332 Composite numbers n such that juxtaposition of prime factors of n has length 8.
 * @author Sean A. Irvine
 */
public class A036332 implements Sequence {

  private TreeSet<Z> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      // Precomputing this is too slow for the constructor.
      mA = A036328.build(8);
    }
    return mA.isEmpty() ? null : mA.pollFirst();
  }
}
