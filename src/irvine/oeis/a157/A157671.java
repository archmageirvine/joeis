package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A157671 Numbers whose ternary representation begins with 2.
 * @author Georg Fischer
 */
public class A157671 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Long.toString(++mN, 3).startsWith("2")) {
        return Z.valueOf(mN);
      }
    }
  }
}
