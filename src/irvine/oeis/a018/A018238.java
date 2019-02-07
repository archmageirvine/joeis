package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018238.
 * @author Sean A. Irvine
 */
public class A018238 implements Sequence {

  private String mA = null;

  @Override
  public Z next() {
    mA = mA == null
      ? "1"
      : String.valueOf(mA.charAt(0) - '0' + 1) + mA.substring(1) + mA;
    return new Z(mA);
  }
}

