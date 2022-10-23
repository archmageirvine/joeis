package irvine.oeis.a002;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002065 a(n+1) = a(n)^2 + a(n) + 1.
 * @author Sean A. Irvine
 */
public class A002065 extends Sequence0 implements Serializable {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.multiply(mA.add(1)).add(1);
    return mA;
  }
}

