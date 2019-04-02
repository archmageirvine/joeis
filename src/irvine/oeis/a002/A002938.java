package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002938 The minimal sequence (from solving n^3 - m^2 = a(n)).
 * @author Sean A. Irvine
 */
public class A002938 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n3 = mN.pow(3);
    final Z[] s = n3.sqrtAndRemainder();
    if (Z.ZERO.equals(s[1])) {
      return Z.ZERO;
    }
    return n3.subtract(s[0].square()).min(s[0].add(1).square().subtract(n3));
  }
}
