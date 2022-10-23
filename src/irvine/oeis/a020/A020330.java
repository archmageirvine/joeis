package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020330 Numbers whose base-2 representation is the juxtaposition of two identical strings.
 * @author Sean A. Irvine
 */
public class A020330 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN).shiftLeft((int) LongUtils.lg(mN)).add(mN);
  }
}
