package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010722 Constant sequence: the all 6's sequence.
 * @author Sean A. Irvine
 */
public class A010722 implements Sequence {

  @Override
  public Z next() {
    return Z.SIX;
  }
}
