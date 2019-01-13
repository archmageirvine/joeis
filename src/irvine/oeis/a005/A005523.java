package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A005523.
 * @author Sean A. Irvine
 */
public class A005523 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return q.add(1).add(q.multiply(4).sqrt());
  }
}
