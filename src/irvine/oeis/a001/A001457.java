package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A001457 Number of permutations of length n with longest increasing subsequence of length 6.
 * @author Sean A. Irvine
 */
public class A001457 extends A047874 {

  /** Construct the sequence. */
  public A001457() {
    super(6);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(6);
    return g(mN, Math.min(mN, 6), l);
  }
}
