package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007862 Number of triangular numbers that divide n.
 * @author Sean A. Irvine
 */
public class A007862 extends AbstractSequence {

  /* Construct the sequence. */
  public A007862() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long count = 0;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      if (mN % (dd.intValueExact() + 1) == 0) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
