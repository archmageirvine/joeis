package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;
import irvine.oeis.a072.A072796;

/**
 * A073283 Permutation of natural numbers induced by the composition of the Catalan bijections A057163 &amp; A072796.
 * @author Sean A. Irvine
 */
public class A073283 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(A072796.s072796(SExpression.binexp2pars(super.next())).toZ()));
  }
}
