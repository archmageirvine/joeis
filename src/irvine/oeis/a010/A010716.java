package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010716 Constant sequence: the all 5's sequence.
 * @author Sean A. Irvine
 */
public class A010716 extends Sequence0 {

  @Override
  public Z next() {
    return Z.FIVE;
  }
}
