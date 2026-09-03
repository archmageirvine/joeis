package irvine.oeis.a086;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;
import irvine.oeis.a074.A074683;

/**
 * A086426 Permutation of natural numbers induced by the Catalan bijection gma086426 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A086426 extends A014486 {

  static Z g086426(final Z n) {
    return A074683.s074683(SExpression.binexp2pars(A057164.bcr(n))).toZ();
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(g086426(super.next()));
  }
}

