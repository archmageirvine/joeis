package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080068 Iterates of A080067.
 * @author Sean A. Irvine
 */
public class A080068 extends A080069 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(super.next());
  }
}

