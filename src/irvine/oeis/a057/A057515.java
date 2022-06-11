package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057515 Number of separate "mountains" in mountain ranges encoded by A014486, number of bottom branches (trunks) in the corresponding rooted plane trees, i.e., the degree of the root node.
 * @author Sean A. Irvine
 */
public class A057515 extends A014486 {

  @Override
  public Z next() {
    return Z.valueOf(SExpression.binexp2pars(super.next()).size());
  }
}
