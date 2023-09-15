package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107844 Highest value obtained in the recursion of McCarthy's 91 function until it terminates.
 * @author Sean A. Irvine
 */
public class A107844 extends Sequence1 {

  private static final Z Z111 = Z.valueOf(111);
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 100 ? Z111 : Z.valueOf(mN);
  }
}
