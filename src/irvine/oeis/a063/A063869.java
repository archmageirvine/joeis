package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063869 Least k such that sigma(k)=m^n for some m&gt;1.
 * @author Sean A. Irvine
 */
public class A063869 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z sigma = Functions.SIGMA.z(++k);
      if (sigma.root(mN).auxiliary() == 1) {
        return Z.valueOf(k);
      }
    }
  }
}
