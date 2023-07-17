package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033883 Deficiency of the deficient or perfect numbers: m = 2n - sigma(n) for n such that m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A033883 extends A033879 {

  /** Construct the sequence. */
  public A033883() {
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
