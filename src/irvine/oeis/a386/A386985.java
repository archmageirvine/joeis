package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence2;

/**
 * A386218.
 * @author Sean A. Irvine
 */
public class A386985 extends Sequence2 implements Conjectural {

  // We are only heuristic in the sense we return -1 for hard cases
  private static final int HEURISTIC = 500;
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    long k = 0;
    while (k < HEURISTIC) {
      sb.insert(0, Long.toString(++k, mN));
      if (new Z(sb, mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
    return Z.NEG_ONE;
  }
}
