package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030111 Triangular array in which k-th entry in n-th row is C([ (n+k)/2 ],k) (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A030111 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial((mN + mM) / 2, mM);
  }
}
