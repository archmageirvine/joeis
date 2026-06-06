package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057501;
import irvine.oeis.a074.A074683;
import irvine.oeis.a074.A074684;

/**
 * A085173 Permutation of natural numbers induced by the Catalan bijection gma085173 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085173 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A074684.s074684(A057501.rotateHandshakesP(A074683.s074683(SExpression.binexp2pars(super.next())))).toZ());
  }
}
