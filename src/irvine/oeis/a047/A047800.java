package irvine.oeis.a047;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047800 Number of different values of i^2 + j^2 for i,j in [0, n].
 * @author Sean A. Irvine
 */
public class A047800 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    for (long k = 0; k <= mN; ++k) {
      mA.add(s + k * k);
    }
    return Z.valueOf(mA.size());
  }
}
