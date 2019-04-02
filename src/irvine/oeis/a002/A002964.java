package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002964 Smallest number requiring n chisel strokes for its representation in Roman numerals.
 * @author Sean A. Irvine
 */
public class A002964 extends A002963 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (super.next().intValueExact() != mN) {
      ++mM;
    }
    return Z.valueOf(++mM);
  }
}
