package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A318468.
 * @author Sean A. Irvine
 */
public class A318468 extends A000203 {

  @Override
  public Z next() {
    return super.next().and(Z.valueOf(2 * mN));
  }
}
