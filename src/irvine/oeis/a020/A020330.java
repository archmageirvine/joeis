package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020330.
 * @author Sean A. Irvine
 */
public class A020330 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN).shiftLeft((int) LongUtils.lg(mN)).add(mN);
  }
}
