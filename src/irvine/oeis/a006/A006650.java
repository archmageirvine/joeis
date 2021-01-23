package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048179;
import irvine.oeis.a048.A048180;

/**
 * A006650 Number of graphs with n nodes, n+1 edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006650 extends A048179 {

  private boolean mFirst = true;
  private Sequence mA = new A048180();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    }
    return super.next().subtract(mA.next());
  }
}
