package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000575.
 * @author Sean A. Irvine
 */
public class A000575 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    final Z n2 = n.square();
    return n2.multiply(n).add(n2.multiply(42)).add(n.multiply(677)).add(5040)
      .multiply(Binomial.binomial(mN + 6, 6)).divide(504);
  }
}

