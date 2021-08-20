package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050872 a(n)=(1/2)*A050871 (row sums of array T in A050870, periodic binary words).
 * @author Sean A. Irvine
 */
public class A050872 extends A050871 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
