package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027427 Number of distinct products <code>ij</code> with <code>0 &lt;= i &lt; j &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A027427 implements Sequence {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mSeen.add(k * mN);
    }
    return Z.valueOf(mSeen.size());
  }
}
