package irvine.oeis.a271;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;

/**
 * A271715 Number of set partitions of [3n] with minimal block length multiplicity equal to n.
 * @author Georg Fischer
 */
public class A271715 extends A271424 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(3 * mN, mN);
  }
}

