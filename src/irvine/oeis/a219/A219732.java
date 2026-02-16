package irvine.oeis.a219;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a028.A028362;

/**
 * A219732 a(n) = (Product_{i=1..n-1} (2^i + 1)) modulo (2^n - 1).
 * @author Georg Fischer
 */
public class A219732 extends Sequence1 {

  private final Sequence mA028362 = new A028362().skip();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mA028362.next().mod(Z.TWO.pow(Z.valueOf(mN)).subtract(Z.ONE));
  }
}
