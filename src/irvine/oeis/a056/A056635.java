package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004977;
import irvine.oeis.a005.A005341;

/**
 * A056635 Difference between length (A005341) and sum of digits (A004977) of n-th term in Look and Say Sequence (A005150).
 * @author Sean A. Irvine
 */
public class A056635 extends A005341 {

  private final Sequence mA = new A004977();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).abs();
  }
}
