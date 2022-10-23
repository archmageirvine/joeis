package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009001 Expansion of e.g.f: (1+x)*cos(x).
 * @author Sean A. Irvine
 */
public class A009001 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final boolean b = (mN & 2) != 2;
    return (++mN & 1) == 0 ? b ? Z.NEG_ONE : Z.ONE : Z.valueOf(b ? mN : -mN);
  }
}
