package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a110.A110117;
import irvine.oeis.a110.A110118;

/**
 * A014248.
 * @author Sean A. Irvine
 */
public class A014248 extends A110117 {

  private final A110118 mA = new A110118();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
