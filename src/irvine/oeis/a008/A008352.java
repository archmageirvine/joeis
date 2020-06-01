package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008352 <code>a(n)</code> is formed by concatenating <code>a(n-2)</code> and <code>a(n-1)</code>, with <code>a(0) = 1, a(1) = 2;</code>.
 * @author Sean A. Irvine
 */
public class A008352 implements Sequence {

  private String mA = null;
  private String mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
      return Z.ONE;
    }
    if (mB == null) {
      mB = "2";
      return Z.TWO;
    }
    final String t = mA + mB;
    mA = mB;
    mB = t;
    return new Z(t);
  }
}


