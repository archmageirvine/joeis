package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027428 Number of distinct products ij with 1 &lt;= i &lt; j &lt;= n. (Number of terms appearing more than once in a 1-to-n multiplication table.).
 * @author Sean A. Irvine
 */
public class A027428 extends Sequence1 {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      mSeen.add(k * mN);
    }
    return Z.valueOf(mSeen.size());
  }
}
