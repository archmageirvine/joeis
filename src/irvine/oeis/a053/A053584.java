package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053584 a(n+1) is the smallest prime ending with a(n), where a(1)=7.
 * @author Sean A. Irvine
 */
public class A053584 implements Sequence {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "7";
      return Z.SEVEN;
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
