package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A028833 Index of redundancy in period of continued fraction for <code>sqrt(n)</code>.
 * @author Sean A. Irvine
 */
public class A028833 extends A028832 {

  private final A003285 mA = new A003285();

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}
