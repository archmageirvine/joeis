package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A072795 A014486-indices of the plane binary trees AND plane general trees whose left subtree is just a stick: \. thus corresponding to the parenthesizations whose first element (of the top-level list) is an empty parenthesization: ().
 * @author Sean A. Irvine
 */
public class A072795 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(SExpression.createTree(new SExpression(), SExpression.binexp2pars(super.next())).toZ());
  }
}
