package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;
import irvine.oeis.a074.A074684;

/**
 * A082360 Permutation of natural numbers: composition of permutations A057163 and A074684.
 * @author Sean A. Irvine
 */
public class A082360 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(A074684.s074684(SExpression.binexp2pars(super.next())).toZ()));
  }
}
