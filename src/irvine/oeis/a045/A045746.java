package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045746 Numbers whose sum of divisors is a triangular number.
 * @author Sean A. Irvine
 */
public class A045746 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().multiply(8).add(1).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
