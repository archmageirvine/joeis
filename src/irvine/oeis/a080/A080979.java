package irvine.oeis.a080;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A080979 Each tree encoded in A014486 mapped to the corresponding branch-reduced zigzag-tree (positions in A014486).
 * @author Sean A. Irvine
 */
public class A080979 extends A014486 {

  static SExpression branchReducedZigzagTree(final SExpression bt) {
    if (bt.isPair()) {
      if (bt.car().isPair() && !bt.caar().isEmpty() && bt.cdar().isEmpty()) {
        bt.setCar(bt.caar());
        branchReducedZigzagTree(bt);
      } else if (bt.cdr().isPair() && !bt.cddr().isEmpty() && bt.cadr().isEmpty()) {
        bt.setCdr(bt.cddr());
        branchReducedZigzagTree(bt);
      } else {
        bt.setCar(branchReducedZigzagTree(bt.car()));
        bt.setCdr(branchReducedZigzagTree(bt.cdr()));
      }
    }
    return bt;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(branchReducedZigzagTree(SExpression.binexp2pars(super.next())).toZ());
  }
}

