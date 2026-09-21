package irvine.oeis.a086;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A086608 Row sums of triangle A086606: the sum of the first n terms of the n-th self-convolution of the sequence formed by flattening triangle A086606.
 * @author Sean A. Irvine
 */
public class A086608 extends A086606 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

