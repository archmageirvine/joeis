package irvine.oeis.a284;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A284891 Concatenation of the numbers from 3 to n.
 * @author Georg Fischer
 */
public class A284891 extends Sequence3 {

  private long mN = 2;
  private final StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.append(String.valueOf(++mN));
    return new Z(mSb.toString());
  }
}
