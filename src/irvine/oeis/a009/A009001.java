package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009001 Expansion of e.g.f: <code>(1+x)*cos(x)</code>.
 * @author Sean A. Irvine
 */
public class A009001 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final boolean b = (mN & 2) != 2;
    return (++mN & 1) == 0 ? b ? Z.NEG_ONE : Z.ONE : Z.valueOf(b ? mN : -mN);
  }
}
