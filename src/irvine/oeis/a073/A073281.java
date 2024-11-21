package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a072.A072796;

/**
 * A073281 Self-inverse permutation of natural numbers induced by the composition of the Catalan bijections A072796 and A073269.
 * @author Sean A. Irvine
 */
public class A073281 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A072796.s072796(A073269.s073269(SExpression.binexp2pars(super.next()))).toZ());
  }
}
