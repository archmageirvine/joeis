package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029848 <code>a(n) = 1 + C(2*n,n) + C(3*n,n)</code>.
 * @author Sean A. Irvine
 */
public class A029848 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.add(Binomial.binomial(2 * ++mN, mN)).add(Binomial.binomial(3 * mN, mN));
  }
}
