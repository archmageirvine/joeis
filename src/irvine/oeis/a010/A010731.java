package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010731 Constant sequence: the all 8's sequence.
 * @author Sean A. Irvine
 */
public class A010731 extends Sequence0 {

  @Override
  public Z next() {
    return Z.EIGHT;
  }
}
