package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A113697 Floor[n concatenated with n+2 divided by n+1].
 * @author Georg Fischer
 */
public class A113697 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(mN) + String.valueOf(mN + 2)).divide(mN + 1);
  }
}
