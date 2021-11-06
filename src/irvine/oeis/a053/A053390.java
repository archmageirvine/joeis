package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053390 A053398(10, n).
 * @author Georg Fischer
 */
public class A053390 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(9, mM - 1);
  }
}
