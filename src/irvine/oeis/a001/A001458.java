package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A001458 Number of permutations of length n with longest increasing subsequence of length 7.
 * @author Sean A. Irvine
 */
public class A001458 extends A047874 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(7);
    return g(mN, Math.min(mN, 7), l);
  }
}
