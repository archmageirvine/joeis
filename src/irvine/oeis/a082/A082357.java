package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A082357 Permutation of natural numbers: composition of permutations A082355 and A057163.
 * @author Sean A. Irvine
 */
public class A082357 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A082355.s082355(SExpression.binexp2pars(A057162.reflectBinTree(super.next()))).toZ());
  }
}
