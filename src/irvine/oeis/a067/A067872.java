package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067872 Least m &gt; 0 for which m*n^2 + 1 is a square.
 * @author Sean A. Irvine
 */
public class A067872 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    long k = 0;
    while (true) {
      if (n2.multiply(++k).add(1).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}
