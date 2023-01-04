package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060865 a(n) is the exact power of 2 that divides the n-th Fibonacci number (A000045).
 * @author Sean A. Irvine
 */
public class A060865 extends A000045 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z t = super.next().makeOdd();
    return Z.ONE.shiftLeft((int) t.auxiliary());
  }
}
