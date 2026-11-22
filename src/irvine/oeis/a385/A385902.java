package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a386.A386792;

/**
 * A385902 Antihydra, a BB(6) Turing machine (values of b).
 * @author Gregory Morse
 */
public class A385902 extends A386792 {
  private Z mB = Z.ZERO;

  @Override
  protected Z step(final Z a) {
    mB = mB.add(a.isOdd() ? -1 : 2);
    return super.step(a);
  }

  @Override
  public Z next() {
    super.next();
    return mB;
  }
}
