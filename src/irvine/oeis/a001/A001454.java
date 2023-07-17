package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A001454 Number of permutations of length n with longest increasing subsequence of length 3.
 * @author Sean A. Irvine
 */
public class A001454 extends A047874 {

  /** Construct the sequence. */
  public A001454() {
    super(3);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(3);
    return g(mN, Math.min(mN, 3), l);
  }
}
