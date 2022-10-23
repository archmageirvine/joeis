package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053850 Odd numbers divisible by a square &gt; 1.
 * @author Sean A. Irvine
 */
public class A053850 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!Jaguar.factor(mN).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
