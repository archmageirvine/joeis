package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A057120 Global ranks of terms of A057119.
 * @author Sean A. Irvine
 */
public class A057120 extends A057119 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(super.next());
  }
}
