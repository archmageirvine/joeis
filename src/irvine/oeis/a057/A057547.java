package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057547 A014486-encodings of Catalan mountain ranges with no sea-level valleys, i.e., the rooted plane general trees with root degree = 1.
 * @author Sean A. Irvine
 */
public class A057547 extends A014486 {

  @Override
  public Z next() {
    return new SExpression(SExpression.binexp2pars(super.next())).toZ();
  }
}
