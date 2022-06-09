package irvine.oeis.a141;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A141828 a(n) = (n^4*a(n-1)-1)/(n-1) for n &gt;= 2, with a(0) = 1, a(1) = 5.
 * @author Georg Fischer
 */
public class A141828 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A141828() {
    super(0, 1, 0, 1, 5);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(Z.valueOf(n).pow(4)).subtract(1).divide(n - 1);
  }
}
