package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053386 A053398(6, n).
 * @author Georg Fischer
 */
public class A053386 extends A053398 {

  protected int mM = 0;

  @Override
  public Z next() {
    ++mM;
    return super.matrixElement(5, mM - 1);
  }
}
