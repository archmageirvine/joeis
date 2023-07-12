package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064459 a(n) = Sum_{k&gt;=1} floor(n/12^k).
 * @author Sean A. Irvine
 */
public class A064459 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    long d = 1;
    while (true) {
      d *= 12;
      final long t = mN / d;
      if (t == 0) {
        return Z.valueOf(s);
      }
      s += t;
    }
  }
}
