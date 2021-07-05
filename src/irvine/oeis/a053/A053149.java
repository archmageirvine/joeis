package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a048.A048798;

/**
 * A053149 Smallest cube divisible by n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A053149 extends A048798 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
