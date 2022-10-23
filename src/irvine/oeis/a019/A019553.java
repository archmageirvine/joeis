package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019553 a(n) is the concatenation of n and 5n.
 * @author Sean A. Irvine
 */
public class A019553 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + String.valueOf(5 * mN));
  }
}
