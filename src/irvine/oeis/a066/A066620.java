package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066620 Number of unordered triples of distinct pairwise coprime divisors of n.
 * @author Sean A. Irvine
 */
public class A066620 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z s0 = fs.sigma0(); // We need this before pow(3) which modifies fs
    return fs.pow(3).sigma0().subtract(s0.multiply(3)).add(2).divide(6);
  }
}
