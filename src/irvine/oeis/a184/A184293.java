package irvine.oeis.a184;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A184293 Number of distinct n X 3 toroidal 0..7 arrays.
 * @author Georg Fischer
 */
public class A184293 extends A184294 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 3);
  }
}

