package irvine.oeis.a368;

import irvine.math.RayoNames;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A368006 Rayo's function: smallest natural number larger than any number uniquely defined by an n-symbol formula in First Order Set Theory.
 * @author Gregory Morse
 */
public class A368006 extends Sequence0 {

  private static final int[] TERMS = RayoNames.terms();
  private int mN;

  @Override
  public Z next() {
    if (mN == TERMS.length) {
      throw new UnsupportedOperationException("Only lengths through 30 are verified");
    }
    return Z.valueOf(TERMS[mN++]);
  }
}
