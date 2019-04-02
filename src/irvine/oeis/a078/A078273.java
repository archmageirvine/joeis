package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078273 Smallest multiple of n other than n using only the digits of n (no limit on frequency).
 * @author Sean A. Irvine
 */
public class A078273 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final boolean[] allowed = new boolean[10];
    long t = mN;
    while (t != 0) {
      allowed[(int) (t % 10)] = true;
      t /= 10;
    }
    final Z n = Z.valueOf(mN);
    long k = 1;
    while (true) {
      final Z g = n.multiply(++k);
      final String v = g.toString();
      boolean ok = true;
      for (int j = 0; j < v.length(); ++j) {
        if (!allowed[v.charAt(j) - '0']) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return g;
      }
    }
  }
}

