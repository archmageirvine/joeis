package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162534 A positive integer n is included if every length of the runs of <code>0</code>'s and <code>1</code>'s in the binary representation of n divides n.
 * @author Sean A. Irvine
 */
public class A162534 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z v = Z.valueOf(++mN);
      if (A162536.test(v, mN)) {
        return v;
      }
    }
  }
}

