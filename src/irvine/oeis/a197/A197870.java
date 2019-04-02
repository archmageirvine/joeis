package irvine.oeis.a197;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A197870 Expansion of false theta series variation of Ramanujan theta function psi(x).
 * @author Sean A. Irvine
 */
public class A197870 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z[] s = mN.shiftLeft(3).add(1).sqrtAndRemainder();
    return s[1].equals(Z.ZERO) ? (s[0].divide2().isEven() ? Z.ONE : Z.NEG_ONE) : Z.ZERO;
  }
}
