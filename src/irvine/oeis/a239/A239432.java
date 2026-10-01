package irvine.oeis.a239;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A239432 Number of permutations of length n with longest increasing subsequence of length 8.
 * @author Sean A. Irvine
 */
public class A239432 extends A047874 {

  /** Construct the sequence. */
  public A239432() {
    super(7);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(8);
    return g(mN, Math.min(mN, 8), l);
  }
}
