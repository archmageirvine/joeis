package irvine.oeis.a245;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A245665 Number of permutations of length n with longest increasing subsequence of length 9.
 * @author Sean A. Irvine
 */
public class A245665 extends A047874 {

  /** Construct the sequence. */
  public A245665() {
    super(7);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(9);
    return g(mN, Math.min(mN, 9), l);
  }
}
