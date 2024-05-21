package irvine.oeis.a069;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a057.A057162;

/**
 * A069769 Self-inverse permutation of natural numbers induced by the automorphism Rev1CarSide! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069769 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A057162.reflectBinTree(SExpression.binexp2pars(A057162.reflectBinTree(super.next())).reverse().toZ()));
  }
}

