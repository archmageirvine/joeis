package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019553 a(n) is the concatenation of n and 5n.
 * @author Sean A. Irvine
 */
public class A019553 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + String.valueOf(5 * mN));
  }
}
