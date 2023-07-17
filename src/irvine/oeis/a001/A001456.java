package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A001456 Number of permutations of length n with longest increasing subsequence of length 5.
 * @author Sean A. Irvine
 */
public class A001456 extends A047874 {

  /** Construct the sequence. */
  public A001456() {
    super(5);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(5);
    return g(mN, Math.min(mN, 5), l);
  }
}
