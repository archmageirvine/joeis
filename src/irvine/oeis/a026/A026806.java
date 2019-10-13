package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026806 <code>a(n) =</code> number of numbers k such that only one partition of n has least part k.
 * @author Sean A. Irvine
 */
public class A026806 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(1 + ++mN / 2 - mN / 3);
  }
}
