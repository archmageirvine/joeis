package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053385 A053398(5, n).
 * @author Georg Fischer
 */
public class A053385 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(4, mM - 1);
  }
}
