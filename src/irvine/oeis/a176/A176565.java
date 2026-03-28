package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176565 Triangle read by rows: T(n,k) = binomial(P(n)+k,k) + binomial(P(n)+n-k,n-k) - binomial(P(n)+n,n) where P(n) = A000041(n) is the number of partitions of n.
 * @author Sean A. Irvine
 */
public class A176565 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z p = Functions.PARTITIONS.z(mN);
    return Binomial.binomial(p.add(mM), mM).add(Binomial.binomial(p.add(mN - mM), mN - mM)).subtract(Binomial.binomial(p.add(mN), mN));
  }
}
