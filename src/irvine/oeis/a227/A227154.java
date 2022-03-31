package irvine.oeis.a227;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A227154 Product of digits+1 of n in factorial base.
 * @author Georg Fischer
 */
public class A227154 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    Z b = Z.TWO;
    Z t = Z.ONE;
    while (!n.isZero()) {
      t = t.multiply(n.mod(b).add(1));
      n = n.divide(b);
      b = b.add(1);
    }
    return t;
  }
}
