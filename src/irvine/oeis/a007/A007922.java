package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007922 Smallest k such that k!! is a multiple of n.
 * @author Sean A. Irvine
 */
public class A007922 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      final int n = ++k;
      final Z df = Functions.MULTIFACTORIAL.z(n);
      if (df.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
