package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383361 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A383361 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long k = 0;
      for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
        if (d.multiply(++k).equals(mN)) {
          return d;
        }
      }
    }
  }
}

