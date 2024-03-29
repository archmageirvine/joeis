package irvine.oeis.a243;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A243083 Number of compositions of n into parts with multiplicity not larger than 5.
 * @author Georg Fischer
 */
public class A243083 extends A243081 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 5);
  }
}

