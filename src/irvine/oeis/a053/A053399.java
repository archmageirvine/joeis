package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053399 A053398(3, n).
 * @author Georg Fischer
 */
public class A053399 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(2, mM - 1);
  }
}
