package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a004.A004648;

/**
 * A072609 Changing of parity of remainder A072608(n) from alternation [..010101..] to steadily 1-range [...1111..]. AC-range corresponds to 0, while DC-range labeled by 1.
 * @author Sean A. Irvine
 */
public class A072609 extends A004648 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.and(Z.ONE).multiply(mA.and(Z.ONE));
  }
}
