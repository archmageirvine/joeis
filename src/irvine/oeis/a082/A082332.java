package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;
import irvine.oeis.a057.A057164;
import irvine.oeis.a057.A057501;

/**
 * A082332 Permutation of natural numbers induced by the composition of involutions A069888 and A057163.
 * @author Sean A. Irvine
 */
public class A082332 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057501.rotateHandshakes(A057164.bcr(A057162.reflectBinTree(super.next()))));
  }
}
