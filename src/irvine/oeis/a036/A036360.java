package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001865;

/**
 * A036360 a(n) = Sum_{k=1..n} n! * n^(n-k+1) / (n-k)!.
 * @author Sean A. Irvine
 */
public class A036360 extends A001865 {

  /** Construct the sequence. */
  public A036360() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().multiply(mN * (long) mN);
  }
}
