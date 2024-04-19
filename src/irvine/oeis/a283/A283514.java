package irvine.oeis.a283;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A283514 Concatenation of the numbers from n down to 3.
 * @author Georg Fischer
 */
public class A283514 extends Sequence3 {

  private long mN = 2;
  private final StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.insert(0, ++mN);
    return new Z(mSb.toString());
  }
}
