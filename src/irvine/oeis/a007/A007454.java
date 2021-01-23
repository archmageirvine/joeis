package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003430;

/**
 * A007454 Number of unlabeled disconnected series-parallel posets with n nodes.
 * @author Sean A. Irvine
 */
public class A007454 extends A003430 {

  private final Sequence mConnected = new A007453();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.ONE.max(super.next().subtract(mConnected.next()));
  }
}

