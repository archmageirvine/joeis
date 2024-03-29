package irvine.oeis.a218;
// Generated by gen_seq4.pl tricol

import irvine.math.z.Z;

/**
 * A218702 Number of partitions of n in which any two distinct parts differ by at least 7.
 * @author Georg Fischer
 */
public class A218702 extends A218698 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.compute(++mN, 7);
  }
}

