package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063826 Let 1, 2, 3, 4 represent moves to the right, down, left and up; this sequence describes the movements in the clockwise square spiral (a.k.a. Ulam Spiral).
 * @author Sean A. Irvine
 */
public class A063826 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long n = 4 * ++mN + 1;
    final long t = Functions.SQRT.l(n) & 3;
    return Z.valueOf(t == 0 ? 4 : t);
  }
}
