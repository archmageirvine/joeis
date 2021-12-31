package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053583 a(n+1) is the smallest prime ending with (but not equal to) a(n), where a(1)=3.
 * @author Sean A. Irvine
 */
public class A053583 implements Sequence {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "3";
      return Z.THREE;
    }
    long k = 0;
    while (true) {
      final Z t = new Z(++k + mA);
      if (t.isProbablePrime()) {
        mA = t.toString();
        return t;
      }
    }
  }
}
