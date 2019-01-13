package irvine.oeis.a264;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.BellMatrix;
import irvine.oeis.a000.A000110;

/**
 * A264428.
 * @author Sean A. Irvine
 */
public class A264428 extends A000110 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final BellMatrix mB = new BellMatrix(mA);
  private int mN = -1;
  private int mK = 0;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
      mA.add(super.next());
    }
    return mB.get(mN, mK);
  }
}
