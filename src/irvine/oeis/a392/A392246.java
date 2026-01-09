package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007908;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A392246 extends Sequence0 {

  // Prepend of "1" happens to result in a(0)=101 as required here
  private final Sequence mS = new PrependSequence(new A007908(), 1);

  @Override
  public Z next() {
    final String s = "0" + mS.next();
    long n = 0;
    long lim = 10;
    Z min = null;
    while (true) {
      if (++n == lim) {
        if (min != null) {
          return min;
        }
        lim *= 10;
      }
      final String t = String.valueOf(n);
      // Because s starts with 0, there must be at least one digit from t on left
      for (int k = 1; k <= t.length(); ++k) {
        final Z v = new Z(t.substring(0, k) + s + t.substring(k));
        if ((min == null || v.compareTo(min) < 0) && v.isProbablePrime()) {
          min = v;
        }
      }
    }
  }
}

