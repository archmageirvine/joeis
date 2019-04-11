package irvine.oeis.a210;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A210687 The number of triangles in an equipotential triangle divided by medians into n rows of smaller triangles.
 * @author Sean A. Irvine
 */
public class A210687 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN);
    return t.multiply(1678).add(3117).multiply(t).add(88).multiply(mN)
      .subtract(345L * (mN & 1))
      .subtract(320L * (mN % 3))
      .subtract(90L * (mN & 3))
      .subtract(288L * (t.pow(3).subtract(t.square()).add(t).mod(5)))
      .divide(240);
  }
}
