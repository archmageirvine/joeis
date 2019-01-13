package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.nt.mobius.Mobius;
import irvine.oeis.Sequence;

/**
 * A087989.
 * @author Sean A. Irvine
 */
public class A087989 implements Sequence {

  private long mF = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (mN >= 20) {
      throw new UnsupportedOperationException();
    }
    if (++mN > 1) {
      mF *= mN;
    }
    return Z.valueOf(new Mobius(mF).mertens(mF));
  }
}

