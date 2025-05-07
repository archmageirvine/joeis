package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383429 a(1)=1, and for n&gt;1, a(n) = a(n-1) concatenated with the length of the decimal representation of a(n-1).
 * @author Sean A. Irvine
 */
public class A383429 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final String s = mA.toString();
      mA = new Z(s + s.length());
    }
    return mA;
  }
}

