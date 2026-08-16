package irvine.oeis.a394;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394937 Irregular triangle T(n,k) read by rows: row n lists in increasing order the distinct entries m of the n X n multiplication table that can be written in the form (n-u)*(n-v), where 1 &lt;= u &lt;= v, u+v &lt;= n, and u*v &lt;= n.
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
