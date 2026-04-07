package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a381.A381466;

/**
 * A392200 a(n) = gcd(A381466(n-1), n).
 * @author Sean A. Irvine
 */
public class A392200 extends Sequence1 {

  private final Sequence mA = new A381466();
  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GCD.z(mA.next(), ++mN);
  }
}
