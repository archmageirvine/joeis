package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

import java.util.ArrayList;

/**
 * A001454 Number of permutations of length n with longest increasing subsequence of length 3.
 * @author Sean A. Irvine
 */
public class A001454 extends A047874 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(3);
    return g(mN, Math.min(mN, 3), l);
  }
}
