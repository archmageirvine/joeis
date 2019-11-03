package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027424 Number of distinct products <code>ij</code> with <code>1 &lt;=</code> i, j <code>&lt;= n</code> (number of distinct terms in <code>n X n</code> multiplication table).
 * @author Sean A. Irvine
 */
public class A027424 implements Sequence {

  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      mSeen.add(k * mN);
    }
    return Z.valueOf(mSeen.size());
  }
}
