package irvine.oeis.a044;
// manually 2021-03-04

import irvine.math.z.Z;
import irvine.oeis.a005.A005614;

/**
 * A044432 a(n) is the number whose base-2 representation is d(0)d(1)...d(n), where d=A005614 (the infinite Fibonacci word).
 * @author Georg Fischer
 */
public class A044432 extends A005614 {

  private Z mN;

  /** Construct the sequence */
  public A044432() {
    mN = Z.ZERO;
  }

  @Override
  public Z next() {
    mN = mN.shiftLeft(1).or(super.next());
    return mN;
  }
}
