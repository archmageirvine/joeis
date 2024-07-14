package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000079;

/**
 * A011782 Coefficients of expansion of (1-x)/(1-2*x) in powers of x.
 * @author Sean A. Irvine
 */
public class A011782 extends PrependSequence implements DirectSequence {

  /** Construct the sequence. */
  public A011782() {
    super(new A000079(), Z.ONE);
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ONE : Z.TWO.pow(n.subtract(1));
  }

  @Override
  public Z a(final int n) {
    return (n == 0) ? Z.ONE : Z.TWO.pow(n - 1);
  }

}
