package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002615.
 * @author Sean A. Irvine
 */
public class A002615 extends A002288 {

  {
    super.next(); // skip 0th
  }

  private final Sequence mA = new A002614();

  @Override
  public Z next() {
    return super.next().multiply(19).subtract(mA.next());
  }
}
