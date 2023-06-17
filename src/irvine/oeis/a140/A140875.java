package irvine.oeis.a140;
// manually trisumm/trisimple at 2023-06-08 11:44

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A140875 Triangle read by rows: T(n,m) = gcd(n,m+2) - 2*gcd(n,m+1) - gcd(n,m), with diagonal and subdiagonal removed.
 * @author Georg Fischer
 */
public class A140875 extends BaseTriangle {

  /** Construct the sequence. */
  public A140875() {
    super(1, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k + 2 > n) ? Z.ONE : Z.valueOf(IntegerUtils.gcd(n, k + 2)).subtract(2 * IntegerUtils.gcd(n, k + 1)).subtract(IntegerUtils.gcd(n, k));
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (result.equals(Z.ONE)) { // cannot occur as valid value
      result = super.next();
    }
    return result;
  }
}
