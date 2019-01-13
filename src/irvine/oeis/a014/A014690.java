package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014690.
 * @author Sean A. Irvine
 */
public class A014690 extends A000040 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
