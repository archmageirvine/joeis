package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018854 Smallest factorial that begins with n.
 * @author Sean A. Irvine
 */
public class A018854 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      final int n = ++b;
      if (Functions.FACTORIAL.z(n).toString().startsWith(target)) {
        return Functions.FACTORIAL.z(b);
      }
    }
  }
}
