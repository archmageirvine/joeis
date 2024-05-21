package irvine.oeis.a069;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A069770 Signature permutation of the first non-identity, nonrecursive Catalan automorphism in table A089840: swap the top branches of a binary tree. An involution of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A069770 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(SExpression.binexp2pars(super.next()).exch().toZ());
  }
}
