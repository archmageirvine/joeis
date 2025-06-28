package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000461 Concatenate n n times.
 * @author Sean A. Irvine
 */
public class A000461 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(mN).repeat(mN));
  }
}
