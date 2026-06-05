package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;
import irvine.oeis.a074.A074683;
import irvine.oeis.a074.A074684;

/**
 * A085161 Involution of natural numbers induced by Catalan Automorphism *A085161 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085161 extends A014486 {

  static Z s085161(final Z n) {
    return A074684.s074684(SExpression.binexp2pars(A057164.bcr(A074683.s074683(SExpression.binexp2pars(n)).toZ()))).toZ();
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s085161(super.next()));
  }
}
