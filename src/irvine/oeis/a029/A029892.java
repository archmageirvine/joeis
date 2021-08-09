package irvine.oeis.a029;

import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;

/**
 * A029892 Number of even graphical partitions of order 2n - number of odd partitions.
 * @author Sean A. Irvine
 */
public class A029892 extends A029889 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long count(final HashSet<List<Integer>> seen) {
    long cnt = 0;
    for (final List<Integer> lst : seen) {
      int s = 0;
      for (final int l : lst) {
        s += l;
      }
      cnt += 1 - 2 * (s & 1);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next();
  }
}
