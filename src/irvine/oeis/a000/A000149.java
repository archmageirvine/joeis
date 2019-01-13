package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000149.
 * @author Sean A. Irvine
 */
public class A000149 implements Sequence {

  /**
   * A higher number below will give more certainty of the correct result.
   * A value of 10 is sufficient to replicate T. D. Noe's table.
   */
  private static final int HEADROOM = 10;
  private long mN = -1;

  protected Q nextRational() {
    ++mN;
    Z n = Z.ONE;
    Z f = Z.ONE;
    Q s = Q.ONE;
    long k = 0;
    int over = 0;
    while (true) {
      f = f.multiply(++k);
      n = n.multiply(mN);
      final Q t = new Q(n, f);
      if (t.isProperFraction() && ++over == HEADROOM) {
        break;
      }
      s = s.add(t);
    }
    return s;
  }

  @Override
  public Z next() {
    return nextRational().toZ();
  }
}
