package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019550 a(n) is the concatenation of n and 2n.
 * @author Sean A. Irvine
 */
public class A019550 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + String.valueOf(2 * mN));
  }
}
