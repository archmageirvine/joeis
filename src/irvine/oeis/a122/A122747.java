package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a001.A001813;

/**
 * A122747 Bishops on an <code>n X n</code> board (see Robinson paper for <code>details)</code>.
 * @author Sean A. Irvine
 */
public class A122747 extends A001813 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
