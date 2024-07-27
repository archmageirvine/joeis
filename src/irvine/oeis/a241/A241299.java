package irvine.oeis.a241;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A241299 Initial digit of the decimal expansion of n^(n^n) or n^^3 (in _Don Knuth_'s up-arrow notation).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A241299 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    final Z t = n.pow(n.pow(n));
    return Functions.LEADING_DIGIT.z(t);
  }
}

