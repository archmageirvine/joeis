package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A055643 Babylonian numbers: integers in base 60 with each sexagesimal digit represented by 2 decimal digits, leading zeros omitted.
 * Integers in base 60 with each base 60 digit represented by 2 decimal digits.
 * @author Georg Fischer
 */
public class A055643 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return new Z(n.toTwoDigits(60));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
