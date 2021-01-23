package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007395 Constant sequence: the all 2's sequence.
 * @author Sean A. Irvine
 */
public class A007395 implements Sequence {

  @Override
  public Z next() {
    return Z.TWO;
  }
}
