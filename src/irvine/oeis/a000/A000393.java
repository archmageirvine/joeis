package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001385;
import irvine.oeis.a034.A034823;

/**
 * A000393 Number of n-node rooted trees of height 6.
 * @author Sean A. Irvine
 */
public class A000393 extends A034823 {

  private final A001385 mA = new A001385();

  {
    // skip one entry
    super.next();
    mA.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
