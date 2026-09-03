package irvine.oeis.a086;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;
import irvine.oeis.a074.A074684;

/**
 * A086425 Permutation of natural numbers induced by the Catalan bijection gma086425 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A086425 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057164.bcr(A074684.s074684(SExpression.binexp2pars(super.next())).toZ()));
  }
}

