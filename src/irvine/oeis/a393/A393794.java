package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393794 allocated for Remco Havenaar.
 * @author Sean A. Irvine
 */
public class A393794 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.TEN.pow(++mN).subtract(1).multiply(110);
  }
}
