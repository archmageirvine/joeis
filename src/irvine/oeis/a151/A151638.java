package irvine.oeis.a151;
// Generated by gen_seq4.pl build/btrionk

import irvine.math.z.Z;
import irvine.oeis.a174.A174266;

/**
 * A151638 Number of permutations of 3 indistinguishable copies of 1..n with exactly 8 adjacent element pairs in decreasing order.
 * @author Georg Fischer
 */
public class A151638 extends A174266 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 8);
  }
}

