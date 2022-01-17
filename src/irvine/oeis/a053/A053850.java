package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053850 Odd numbers divisible by a square &gt; 1.
 * @author Sean A. Irvine
 */
public class A053850 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!Cheetah.factor(mN).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
