package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063530 Numbers k such that phi(k)+1 is a square.
 * @author Sean A. Irvine
 */
public class A063530 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.PHI.z(n).add(1).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
