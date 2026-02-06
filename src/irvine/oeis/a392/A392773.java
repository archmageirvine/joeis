package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392773 The smallest x for which x^2 == 2 (mod F(n)), where F(n) is the n-th Fermat number.
 * @author Sean A. Irvine
 */
public class A392773 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(1L << (mN - 1)).subtract(1).shiftLeft(1L << (mN - 2));
  }
}
