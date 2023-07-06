package irvine.oeis.a264;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.transform.BellMatrixTransformSequence;
import irvine.oeis.a000.A000110;

/**
 * A264428 Triangle read by rows, Bell transform of Bell numbers.
 * @author Sean A. Irvine
 */
public class A264428 extends A000110 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final BellMatrixTransformSequence mB = new BellMatrixTransformSequence(mA);
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
