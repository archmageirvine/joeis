package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010701 Constant sequence: the all 3's sequence.
 * @author Sean A. Irvine
 */
public class A010701 extends Sequence0 {

  @Override
  public Z next() {
    return Z.THREE;
  }
}
