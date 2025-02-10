package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A057121 Local ranks of terms of A057119.
 * @author Sean A. Irvine
 */
public class A057121 extends A057119 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.LOCAL_CATALAN_RANK.z(1L << ++mN, super.next());
  }
}
