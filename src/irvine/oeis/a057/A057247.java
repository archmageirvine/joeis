package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057247 a(n) is the smallest prime of the form 1 + prime(n)*2^m, with m &gt; 0.
 * @author Sean A. Irvine
 */
public class A057247 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    do {
      p = p.multiply2();
    } while (!p.add(1).isProbablePrime());
    return p.add(1);
  }
}
