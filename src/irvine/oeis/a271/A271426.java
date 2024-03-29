package irvine.oeis.a271;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;

/**
 * A271426 Number of set partitions of [n] with minimal block length multiplicity equal to one.
 * @author Georg Fischer
 */
public class A271426 extends A271424 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(mN, 1);
  }
}

