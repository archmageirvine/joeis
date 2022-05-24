package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057146 The sequence 2, floor(a), floor(a^2), floor(a^3), ..., with a = 1+sqrt(5).
 * @author Sean A. Irvine
 */
public class A057146 implements Sequence {

  private static final CR C = CR.FIVE.sqrt().add(CR.ONE);
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : C.pow(mN).floor();
  }
}
