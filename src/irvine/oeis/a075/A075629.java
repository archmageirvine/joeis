package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075629 extends A075626 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
