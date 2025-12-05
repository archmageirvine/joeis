package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A082358 Permutation of natural numbers: composition of permutations A057163 &amp; A082356.
 * @author Sean A. Irvine
 */
public class A082358 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(A082356.s082356(SExpression.binexp2pars(super.next())).toZ()));
  }
}
