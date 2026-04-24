package irvine.oeis.a237;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A237042 UPC check digit for n.
 * @author Sean A. Irvine
 */
public class A237042 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    long m = n;
    long sum = 0;
    while (m != 0) {
      sum += (m % 100) * 31 / -10;
      m /= 100;
    }
    return Z.valueOf(((sum % 10) + 10) % 10);
  }
}

