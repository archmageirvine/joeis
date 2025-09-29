package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a028.A028334;

/**
 * A388737 a(1) = 0, a(n) = abs(x) + abs(y), with x and y the next coordinates by using A028334 as a rectangular spiral.
 * @author Sean A. Irvine
 */
public class A388737 extends Sequence1 {

  private final Sequence mS = new A028334();
  private long mX = 0;
  private long mY = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long t = mS.next().multiply(Z.NEG_ONE.pow((mN & 3) >>> 1)).longValueExact();
      if ((mN & 1) == 0) {
        mX -= t;
      } else {
        mY -= t;
      }
    }
    return Z.valueOf(Math.abs(mX) + Math.abs(mY));
  }
}

