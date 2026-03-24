package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176565 A symmetrical triangle:t(n,m)=Binomial[PartitionsP[n] + m, m] + Binomial[PartitionsP[n] + n - m, n - m] - (Binomial[PartitionsP[n] + 0, 0] + Binomial[PartitionsP[ n] + n - 0, n - 0]) + 1.
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
