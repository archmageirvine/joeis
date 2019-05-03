package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;

/**
 * A005003 Number of rhyme schemes (see reference for precise <code>definition)</code>.
 * @author Sean A. Irvine
 */
public class A005003 implements Sequence {

  private long mN = 1;
  private Z mA = Z.ZERO;
  private final Sequence mBell = new A000110();
  {
    mBell.next();
    mBell.next();
  }

  @Override
  public Z next() {
    mA = mA.multiply(3).add(mBell.next()).subtract(Stirling.secondKind(++mN, 1));
    return mA;
  }
}
