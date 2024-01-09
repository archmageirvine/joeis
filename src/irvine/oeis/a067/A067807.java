package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067807 Numbers n such that sigma(n)^2 &gt; 2*sigma(n^2).
 * @author Sean A. Irvine
 */
public class A067807 extends Sequence1 {

  private long mN = 23;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Jaguar.factor(n).sigma().square().compareTo(Jaguar.factor(n.square()).sigma().multiply2()) > 0) {
        return n;
      }
    }
  }
}
