package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082080 Smallest balanced prime of order n.
 * @author Sean A. Irvine
 */
public class A082080 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return new A082077(++mN).next();
  }
}
