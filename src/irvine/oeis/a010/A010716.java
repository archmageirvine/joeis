package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010716 Constant sequence: the all <code>5</code>'s sequence.
 * @author Sean A. Irvine
 */
public class A010716 implements Sequence {

  @Override
  public Z next() {
    return Z.FIVE;
  }
}
