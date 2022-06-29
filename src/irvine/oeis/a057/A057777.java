package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057777 a(n) is the smallest number such that a(n)+1 is a prime and the largest power of 2 which divides it is 2^n.
 * @author Sean A. Irvine
 */
public class A057777 extends A057775 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
