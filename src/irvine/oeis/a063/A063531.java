package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063531 Numbers k such that sigma(k) + 1 is a square.
 * @author Sean A. Irvine
 */
public class A063531 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().add(1).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
