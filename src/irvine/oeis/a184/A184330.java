package irvine.oeis.a184;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A184330 Number of distinct n X 3 toroidal 0..6 arrays.
 * @author Georg Fischer
 */
public class A184330 extends A184331 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 3);
  }
}

