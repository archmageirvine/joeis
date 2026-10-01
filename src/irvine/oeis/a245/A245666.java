package irvine.oeis.a245;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a047.A047874;

/**
 * A245666 Number of permutations of length n with longest increasing subsequence of length 10.
 * @author Sean A. Irvine
 */
public class A245666 extends A047874 {

  /** Construct the sequence. */
  public A245666() {
    super(7);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> l = new ArrayList<>();
    l.add(10);
    return g(mN, Math.min(mN, 10), l);
  }
}
