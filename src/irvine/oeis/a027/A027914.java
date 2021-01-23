package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a002.A002426;

/**
 * A027914 T(n,0) + T(n,1) + ... + T(n,n), T given by A027907.
 * @author Sean A. Irvine
 */
public class A027914 extends A002426 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return super.next().add(mA).divide2();
  }
}

