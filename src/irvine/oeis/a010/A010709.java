package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010709 Constant sequence: the all 4's sequence.
 * @author Sean A. Irvine
 */
public class A010709 implements Sequence {

  @Override
  public Z next() {
    return Z.FOUR;
  }
}
