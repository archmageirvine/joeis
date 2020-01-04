package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A028329.
 * @author Sean A. Irvine
 */
public class A028329 extends A000984 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
