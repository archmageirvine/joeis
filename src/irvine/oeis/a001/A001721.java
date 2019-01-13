package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001721.
 * @author Sean A. Irvine
 */
public class A001721 implements Sequence {

  private long mN = -1;

  protected long offset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z five = Z.ONE;
    final long o = offset();
    for (int k = 0; k <= mN; ++k) {
      final Z t = Binomial.binomial(k + o, o).multiply(Stirling.firstKind(mN + o, k + o)).multiply(five);
      s = s.signedAdd(((mN + k) & 1) == 0, t);
      five = five.multiply(5);
    }
    return s;
  }

}
