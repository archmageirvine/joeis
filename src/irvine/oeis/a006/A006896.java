package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a004.A004140;

/**
 * A006896 <code>a(n)</code> is the number of hierarchical linear models on n labeled factors allowing 2-way interactions (but no higher order interactions); or the number of simple labeled graphs with nodes chosen from an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A006896 extends A004140 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
