package irvine.oeis.a080;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;
import irvine.oeis.a057.A057164;

/**
 * A080067 a(n) = A057163(A057548(A057164(n))).
 * @author Sean A. Irvine
 */
public class A080067 extends A014486 {

  protected Z t(final Z n) {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(new SExpression(SExpression.binexp2pars(A057164.bcr(n))).toZ()));
  }

  @Override
  public Z next() {
    return t(super.next());
  }
}

