package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053389 A053398(9, n).
 * @author Georg Fischer
 */
public class A053389 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(8, mM - 1);
  }
}
