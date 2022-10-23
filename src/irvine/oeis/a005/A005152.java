package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005152 Rotation distance between binary trees on n nodes.
 * @author Sean A. Irvine
 */
public class A005152 extends Sequence1 {

  private static final long[] S = {0, 1, 2, 4, 5, 7, 9, 11, 12, 15};
  private long mN = -1;
  @Override
  public Z next() {
    return Z.valueOf(++mN < S.length ? S[(int) mN] : 2 * mN - 4);
  }
}
