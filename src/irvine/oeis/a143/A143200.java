package irvine.oeis.a143;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143200 Triangle read by rows: T(n, k) = 1 if k = 0 or k = n, T(n, k) = -1 if ( binomial(n, k) mod 2 ) = 1, otherwise T(n, k) = 0.
 * @author Georg Fischer
 */
public class A143200 extends BaseTriangle {

  /** Construct the sequence. */
  public A143200() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    final Z bin = Binomial.binomial(n, k);
    return (bin.isOdd() && bin.compareTo(Z.ONE) > 0) ? Z.NEG_ONE : bin.mod(Z.TWO);
  }
}
