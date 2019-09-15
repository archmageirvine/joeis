package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a002.A002426;

/**
 * A027914 <code>T(n,0) + T(n,1) + ... + T(n,n)</code>, T given by <code>A027907</code>.
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

