package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033882 Abundancy of the abundant or perfect numbers: m = sigma(k)-2k for n such that m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A033882 extends A033880 {

  /** Construct the sequence. */
  public A033882() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.signum() >= 0) {
        return a;
      }
    }
  }
}
