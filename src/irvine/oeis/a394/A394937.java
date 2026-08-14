package irvine.oeis.a394;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394937 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A394937 extends Sequence2 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (long u = 1; u <= mN; ++u) {
        for (long v = u; u + v <= mN && u * v <= mN; ++v) {
          mA.add((mN - u) * (mN - v));
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
