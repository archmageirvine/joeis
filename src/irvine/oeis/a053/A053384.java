package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053384 A053398(4, n).
 * @author Georg Fischer
 */
public class A053384 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(3, mM - 1);
  }
}
