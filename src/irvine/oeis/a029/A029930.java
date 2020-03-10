package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029930 If <code>2n =</code> Sum <code>2^e_i, a(n) =</code> Product <code>2^e_i</code>.
 * @author Sean A. Irvine
 */
public class A029930 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    int k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        prod = prod.multiply(Z.ONE.shiftLeft(k));
      }
      ++k;
      m >>>= 1;
    }
    return prod;
  }
}
