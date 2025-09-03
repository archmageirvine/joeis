package irvine.oeis.a080;

import irvine.lisp.SExpression;
import irvine.math.z.Z;

/**
 * A080071 Top-level length of each parenthesization/root degree of general trees encoded in A080070.
 * @author Sean A. Irvine
 */
public class A080071 extends A080069 {

  @Override
  public Z next() {
    return Z.valueOf(SExpression.binexp2pars(super.next()).size());
  }
}
