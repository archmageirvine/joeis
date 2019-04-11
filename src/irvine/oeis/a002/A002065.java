package irvine.oeis.a002;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002065 <code>a(n+1) = a(n)^2 + a(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A002065 implements Sequence, Serializable {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.multiply(mA.add(1)).add(1);
    return mA;
  }
}

