package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052273 Number of distinct 4th powers mod n.
 * @author Sean A. Irvine
 */
public class A052273 implements Sequence {

  private long mN = 0;

  protected long power() {
    return 4;
  }

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> seen = new TreeSet<>();
    for (long k = 0; k < mN; ++k) {
      seen.add(LongUtils.modPow(k, power(), mN));
    }
    return Z.valueOf(seen.size());
  }
}
