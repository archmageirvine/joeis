package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032608 Concatenation of n and <code>n + 3</code>.
 * @author Sean A. Irvine
 */
public class A032608 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + (mN + 3));
  }
}
