package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078610 Least m such that B(n!) = B(n!+m), where B(n) is the sum of binary digits of n.
 * @author Sean A. Irvine
 */
public class A078610 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    final long b = f.bitCount();
    long k = 0;
    while (true) {
      if (b == f.add(++k).bitCount()) {
        return Z.valueOf(k);
      }
    }
  }
}

