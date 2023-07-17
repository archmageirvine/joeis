package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A030693 Smallest nontrivial extension of n-th cube which is a square.
 * @author Sean A. Irvine
 */
public class A030693 extends A000578 {

  /** Construct the sequence. */
  public A030693() {
    super(1);
  }

  private static final long[] STEPS = {1, 1, 3, 1, 1, 3};

  {
    super.next();
  }

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
    long lim = 10;
    long v = -1;
    int s = -1;
    while (true) {
      if (++s == STEPS.length) {
        s = 0;
      }
      v += STEPS[s];
      if (v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 0; // to allow for leading 0s in what is appended
        s = 0;
      }
      final Z u = t.add(v);
      if (u.isSquare()) {
        return u;
      }
    }
  }
}

