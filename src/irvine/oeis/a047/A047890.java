package irvine.oeis.a047;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A047890 Number of permutations in S_n with longest increasing subsequence of length &lt;= 5.
 * @author Sean A. Irvine
 */
public class A047890 extends A047874 {

  private int mN = 0;

  @Override
  public Z next() {
    return g(++mN, 5, new ArrayList<>());
  }
}
