package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085892 Group the natural numbers such that the product of the n-th group has n prime divisors: (1), (2), (3,4), (5,6), (7,8,9,10), (11,12,13,14), (15,16,17,18,19,20,21), ... Sequence contains the product of the terms of the groups.
 * @author Sean A. Irvine
 */
public class A085892 extends Sequence0 {

  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = new FactorSequence();
    do {
      fs.add(++mM);
      Jaguar.factor(fs);
    } while (fs.omega() != mN);
    return fs.product();
  }
}
