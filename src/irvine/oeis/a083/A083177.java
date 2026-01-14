package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083177 Let P(k) = floor(k/2). Start with n, apply P repeatedly until reach 1. a(n) = concatenation of numbers obtained.
 * @author Sean A. Irvine
 */
public class A083177 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long t = ++mN;
    while (t != 0) {
      final long u = t;
      t /= 2;
      sb.append(u - t);
    }
    return new Z(sb);
  }
}

