package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A047749 If n = 2*m then a(n) = binomial(3*m, m)/(2*m+1), if n=2*m+1 then a(n) = binomial(3*m+1, m+1)/(2*m+1).
 * @author Sean A. Irvine
 */
public class A047749 extends A001764 {

  private long mN = -1;

  /** Construct the sequence. */
  public A047749() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A047749(final int offset) {
    super(offset);
  }

  protected Z a47749(final long n) {
    if ((n & 1) == 1) {
      final long x = (n - 1) / 2;
      return Binomial.binomial(3 * x + 1, 2 * x + 1).divide(x + 1);
    }
    return a1764(n / 2);
  }

  @Override
  public Z next() {
    return a47749(++mN);
  }
}
