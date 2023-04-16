package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A098129 Concatenate 1 once, 2 twice, 3 three times, up to n n times.
 * @author Sean A. Irvine
 */
public class A098129 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      mA.append(mN);
    }
    return new Z(mA);
  }
}

