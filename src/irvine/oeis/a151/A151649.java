package irvine.oeis.a151;
// Generated by gen_seq4.pl build/btrionk

import irvine.math.z.Z;
import irvine.oeis.a237.A237202;

/**
 * A151649 Number of permutations of 5 indistinguishable copies of 1..n with exactly 4 adjacent element pairs in decreasing order.
 * @author Georg Fischer
 */
public class A151649 extends A237202 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 4);
  }
}

