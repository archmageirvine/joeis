package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047778 Concatenation of the first n numbers in binary (converted to base 10).
 * @author Sean A. Irvine
 */
public class A047778 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    mS.append(Long.toBinaryString(++mN));
    return new Z(mS, 2);
  }
}
