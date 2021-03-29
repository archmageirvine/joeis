package irvine.oeis.a045;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045930 The generalized Connell sequence C_{3,5}.
 * @author Sean A. Irvine
 */
public class A045930 implements Sequence {

  private static final CR R10 = CR.valueOf(10);
  private static final CR R13 = CR.valueOf(13);
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3 * ++mN - 2 * CR.valueOf(40 * mN - 31).sqrt().add(R13).divide(R10).floor().longValueExact());
  }
}
