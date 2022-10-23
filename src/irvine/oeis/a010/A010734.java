package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010734 Constant sequence: the all 9's sequence.
 * @author Sean A. Irvine
 */
public class A010734 extends Sequence0 {

  @Override
  public Z next() {
    return Z.NINE;
  }
}
