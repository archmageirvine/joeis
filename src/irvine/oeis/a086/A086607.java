package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086607 Main diagonal of triangle A086606: the n-th term of the n-th self-convolution of the sequence formed by flattening triangle A086606.
 * @author Sean A. Irvine
 */
public class A086607 extends A086606 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

