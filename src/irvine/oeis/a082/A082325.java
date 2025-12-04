package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A082325 Permutation of natural numbers: A057163-conjugate of A057511.
 * @author Sean A. Irvine
 */
public class A082325 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(SExpression.binexp2pars(A057162.reflectBinTree(super.next())).deepRotateLeft().toZ()));
  }
}
