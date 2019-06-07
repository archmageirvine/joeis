package irvine.oeis.a162;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162400 <code>a(n) =</code> the largest square that when represented in binary is a substring within the binary representation of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A162400 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long b = LongUtils.sqrt(mN);
    // Loop is guaranteed to terminate at b = 1, if not before
    while (true) {
      if (s.contains(Long.toBinaryString(b * b))) {
        return Z.valueOf(b * b);
      }
      --b;
    }
  }
}
