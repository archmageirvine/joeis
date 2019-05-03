package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010701 Constant sequence: the all <code>3</code>'s sequence.
 * @author Sean A. Irvine
 */
public class A010701 implements Sequence {

  @Override
  public Z next() {
    return Z.THREE;
  }
}
