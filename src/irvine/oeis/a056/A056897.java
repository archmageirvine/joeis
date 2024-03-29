package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056897 Smallest square where a(n)+n is prime.
 * @author Sean A. Irvine
 */
public class A056897 extends A056896 {

  /** Construct the sequence. */
  public A056897() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
