package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a001.A001813;

/**
 * A122747 Bishops on <code>an n</code> X n board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A122747 extends A001813 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
