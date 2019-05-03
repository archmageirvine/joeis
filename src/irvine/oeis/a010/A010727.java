package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010727 Constant sequence: the all <code>7</code>'s sequence.
 * @author Sean A. Irvine
 */
public class A010727 implements Sequence {

  @Override
  public Z next() {
    return Z.SEVEN;
  }
}
