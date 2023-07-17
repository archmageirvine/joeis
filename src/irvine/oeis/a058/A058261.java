package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A058261 a(n) = n times the Collatz number of n (as given in A006577).
 * @author Sean A. Irvine
 */
public class A058261 extends A006577 {

  /** Construct the sequence. */
  public A058261() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
