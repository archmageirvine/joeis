package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001383;
import irvine.oeis.a001.A001384;

/**
 * A000299.
 * @author Sean A. Irvine
 */
public class A000299 extends A001384 {

  private final A001383 mA1383 = new A001383();
  {
    mA1383.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA1383.next());
  }
}
