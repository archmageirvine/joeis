package irvine.oeis.a261;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A261743 Number of partitions of n where each part i is marked with a word of length i over a nonary alphabet whose letters appear in alphabetical order.
 * @author Georg Fischer
 */
public class A261743 extends A261718 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 9);
  }
}

