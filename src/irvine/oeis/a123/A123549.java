package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005142;
import irvine.oeis.a318.A318870;

/**
 * A123549 Number of unlabeled connected bicolored graphs on 2n nodes which are invariant when the two color classes are interchanged.
 * @author Gregory Morse
 */
public class A123549 extends Sequence0 {
  private final A005142 mConnected = new A005142();
  private final A318870 mRooted = new A318870();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (!mFirst) {
      mConnected.next();
      mRooted.next();
    }
    mFirst = false;
    return mConnected.next().multiply2().subtract(mRooted.next());
  }
}
