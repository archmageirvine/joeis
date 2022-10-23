package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a054.A054406;

/**
 * A022805 a(n) = B(n) + C(n) where B(n) is Beatty sequence [ n*sqrt(3) ] and C is complement of B.
 * @author Sean A. Irvine
 */
public class A022805 extends Sequence1 {

  private final Sequence mA = new A022838();
  private final Sequence mB = new A054406();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
