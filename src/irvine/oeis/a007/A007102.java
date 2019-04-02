package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002829;
import irvine.oeis.a004.A004109;

/**
 * A007102 Number of labeled disconnected trivalent (or cubic) graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A007102 extends A002829 {

  private Sequence mConnected = new PrependSequence(new A004109(), Z.ZERO);

  @Override
  public Z next() {
    return super.next().subtract(mConnected.next());
  }
}
