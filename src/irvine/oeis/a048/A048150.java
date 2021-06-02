package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048150 a(n)=number of numbers h^2+k^2 that are &lt;=2n^2; equivalently, a(n)=T(n,n), array T as in A048149.
 * @author Sean A. Irvine
 */
public class A048150 extends A048149 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}

