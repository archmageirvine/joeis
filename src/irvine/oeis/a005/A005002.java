package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;

/**
 * A005002 Number of rhyme schemes (see reference for precise <code>definition)</code>.
 * @author Sean A. Irvine
 */
public class A005002 implements Sequence {

  private Z mA = Z.ZERO;
  private final Sequence mBell = new A000110();
  {
    mBell.next();
  }

  @Override
  public Z next() {
    mA = mA.multiply2().add(mBell.next());
    return mA;
  }
}
