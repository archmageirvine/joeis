package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069086 Treated as strings, n begins with Floor(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A069086 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      if (s.startsWith(String.valueOf(Functions.SQRT.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

