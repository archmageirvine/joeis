package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001711.
 * @author Sean A. Irvine
 */
public class A001711 implements Sequence {

  private long mN = -1;

  protected long offset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    final long o = offset();
    Z three = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Binomial.binomial(k + o, o).multiply(Stirling.firstKind(mN + o, k + o)).multiply(three);
      s = s.signedAdd(((mN + k) & 1) == 0, t);
      three = three.multiply(3);
    }
    return s;
  }

}
