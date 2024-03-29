package irvine.oeis.a151;
// Generated by gen_seq4.pl build/btrionk

import irvine.math.z.Z;
import irvine.oeis.a237.A237252;

/**
 * A151653 Number of permutations of 6 indistinguishable copies of 1..n with exactly 4 adjacent element pairs in decreasing order.
 * @author Georg Fischer
 */
public class A151653 extends A237252 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 4);
  }
}

