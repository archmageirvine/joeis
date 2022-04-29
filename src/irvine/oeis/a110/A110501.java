package irvine.oeis.a110;
// manually egfsi at 2022-04-29 12:55

import irvine.math.z.Z;
import irvine.oeis.a001.A001469;

/**
 * A110501 Unsigned Genocchi numbers (of first kind) of even index.
 * @author Georg Fischer
 */
public class A110501 extends A001469 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
