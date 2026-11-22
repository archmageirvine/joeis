package irvine.oeis.a179;

import irvine.math.z.Z;
import irvine.oeis.a184.A184271;

/**
 * A179043 Number of n X n checkered tori.
 * @author Gregory Morse
 */
public class A179043 extends A184271 {
  private int mN = -1;

  /** Construct the sequence. */
  public A179043() {
    setOffset(0);
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : matrixElement(mN, mN);
  }
}
