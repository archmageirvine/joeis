package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A073280 Self-inverse permutation of natural numbers induced by the composition of the Catalan bijections A069770 &amp; A057163.
 * @author Sean A. Irvine
 */
public class A073280 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(SExpression.binexp2pars(A057162.reflectBinTree(super.next())).exch().toZ());
  }
}
