package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030230 Numbers that have an odd number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A030230 implements Sequence {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if ((Jaguar.factor(++mN).omega() & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
