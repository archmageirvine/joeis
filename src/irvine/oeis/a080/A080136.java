package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080134.
 * @author Sean A. Irvine
 */
public class A080136 extends Sequence1 {

  private Z mA = null;
  private final CR mX;
  private CR mZ;

  protected A080136(final CR x) {
    mX = x;
    mZ = mX.cos().square();
  }

  /** Construct the sequence. */
  public A080136() {
    this(CR.ONE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z b = mA;
      CR y;
      do {
        b = b.add(1);
        y = mZ.add(mX.multiply(b).cos().square());
      } while (y.compareTo(CR.ONE) > 0);
      mZ = y;
      mA = b;
    }
    return mA;
  }
}
