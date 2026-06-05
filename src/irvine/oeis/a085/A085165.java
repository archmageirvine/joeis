package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A085165 A057163-conjugate of A085159.
 * @author Sean A. Irvine
 */
public class A085165 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(A085159.s085159(A057162.reflectBinTree(super.next()))));
  }
}
