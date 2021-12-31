package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053582 a(n+1) is the smallest prime ending with a(n), where a(1)=1.
 * @author Sean A. Irvine
 */
public class A053582 implements Sequence {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
      return Z.ONE;
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
