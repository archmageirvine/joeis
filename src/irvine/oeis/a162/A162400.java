package irvine.oeis.a162;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162400 a(n) = the largest square that when represented in binary is a substring within the binary representation of n.
 * @author Sean A. Irvine
 */
public class A162400 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long b = Functions.SQRT.l(mN);
    // Loop is guaranteed to terminate at b = 1, if not before
    while (true) {
      if (s.contains(Long.toBinaryString(b * b))) {
        return Z.valueOf(b * b);
      }
      --b;
    }
  }
}
