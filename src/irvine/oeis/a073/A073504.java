package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073504 A possible basis for finite fractal sequences: let u(1) = 1, u(2) = n, u(k) = floor(u(k-1)/2) + floor(u(k-2)/2); then a(n) = lim_{k-&gt;infinity} u(k).
 * @author Sean A. Irvine
 */
public class A073504 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a;
    Z b = Z.ONE;
    Z c = Z.valueOf(++mN);
    do {
      final Z t = b.divide2().add(c.divide2());
      a = b;
      b = c;
      c = t;
    } while (!a.equals(c) || !a.equals(b));
    return c;
  }
}

