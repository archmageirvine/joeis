package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010709.
 * @author Sean A. Irvine
 */
public class A010709 implements Sequence {

  @Override
  public Z next() {
    return Z.FOUR;
  }
}
