package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390275 Number of words covering the alphabet [n] that are irreducible with respect to C, with |C| = 1.
 * @author Sean A. Irvine
 */
public class A390275 extends A390670 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    step();
    return mRow[1];
  }
}
