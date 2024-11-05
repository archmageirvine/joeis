package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072894 Let c(k) be defined as follows: c(1)=1, c(2)=n, c(k+2) = c(k+1)/2 + c(k)/2 if c(k+1) and c(k) have the same parity; c(k+2) = c(k+1)/2 + c(k)/2 + 1/2 otherwise; a(n) = limit_{ k -&gt; infinity} c(k).
 * @author Sean A. Irvine
 */
public class A072894 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.ONE;
    Z b = Z.valueOf(++mN);
    while (true) {
      final Z t;
      if (a.testBit(0) == b.testBit(0)) {
        t = a.add(b).divide2();
      } else {
        t = a.add(b).add(1).divide2();
      }
      a = b;
      b = t;
      if (a.equals(b)) {
        return a;
      }
    }
  }
}

