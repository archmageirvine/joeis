package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026834 <code>a(n) =</code> number of numbers k such that only one partition of n into distinct parts has least part k.
 * @author Sean A. Irvine
 */
public class A026834 extends A026821 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Z.ONE.equals(super.next())) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
