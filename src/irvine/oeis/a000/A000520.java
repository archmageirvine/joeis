package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000520 Nearest integer to log_10 <code>(n)</code>.
 * @author Sean A. Irvine
 */
public class A000520 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final double log = Math.log10(++mN);
    // Javadocs claim 1 ulp accuracy, hence ...
    final double m = Double.longBitsToDouble(Double.doubleToLongBits(log) - 1);
    final double p = Double.longBitsToDouble(Double.doubleToLongBits(log) + 1);
    if (Math.round(p) != Math.round(m)) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(Math.round(log));
  }
}
