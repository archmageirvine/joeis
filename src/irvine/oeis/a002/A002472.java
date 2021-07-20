package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002472 Number of pairs x,y such that y-x=2, (x,n)=1, (y,n)=1 and 1 &lt;= x &lt;= n.
 * @author Sean A. Irvine
 */
public class A002472 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z pe = p.pow(fs.getExponent(p) - 1);
      final Z m = Z.TWO.equals(p) ? pe : pe.multiply(p.subtract(2));
      prod = prod.multiply(m);
    }
    return prod;
  }
}
