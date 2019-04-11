package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a004.A004140;

/**
 * A006896 Number of hierarchical linear models on n factors allowing 2-way interactions; or labeled graphs on <code>&lt;= n</code> nodes.
 * @author Sean A. Irvine
 */
public class A006896 extends A004140 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
