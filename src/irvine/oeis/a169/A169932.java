package irvine.oeis.a169;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A169932 a(n) = 0+n in the arithmetic defined in A169918.
 * <code>a(n) = n - n%10</code>.
 * @author Georg Fischer
 */
public class A169932 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - mN % 10);
  } // next
}
