package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003430;

/**
 * A007454.
 * @author Sean A. Irvine
 */
public class A007454 extends A003430 {

  private final A007453 mConnected = new A007453();

  @Override
  public Z next() {
    return Z.ONE.max(super.next().subtract(mConnected.next()));
  }
}

