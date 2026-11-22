package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386792 Antihydra, a BB(6) Turing machine (values of a).
 * @author Gregory Morse
 */
public class A386792 extends Sequence0 {
  private Z mA = null;

  protected Z step(final Z a) {
    return a.add(a.divide2());
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : step(mA);
    return mA;
  }
}
