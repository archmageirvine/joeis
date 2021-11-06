package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053387 A053398(7, n).
 * @author Georg Fischer
 */
public class A053387 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(6, mM - 1);
  }
}
