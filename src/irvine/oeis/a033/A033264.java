package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a005.A005811;

/**
 * A033264 Number of blocks of <code>{1,0}</code> in the binary expansion of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A033264 extends A005811 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    final Z a = super.next();
    return a.subtract(a.add(1).divide2());
  }
}

