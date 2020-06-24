package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032612 Concatenation of n and <code>n+7</code>.
 * @author Sean A. Irvine
 */
public class A032612 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 7));
  }
}
