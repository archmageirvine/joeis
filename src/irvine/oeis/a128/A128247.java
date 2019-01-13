package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a001.A001783;
import irvine.oeis.a038.A038610;

/**
 * A128247.
 * @author Sean A. Irvine
 */
public class A128247 extends A038610 {

  private final A001783 mS = new A001783();

  @Override
  public Z next() {
    return mS.next().divide(super.next());
  }
}

