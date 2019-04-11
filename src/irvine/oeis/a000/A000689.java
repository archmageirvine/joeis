package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000689 Final decimal digit of <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A000689 implements Sequence {

  private static final Z[] S = {Z.TWO, Z.FOUR, Z.EIGHT, Z.SIX};
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ONE;
    }
    mN &= 3;
    return S[mN];
  }
}
