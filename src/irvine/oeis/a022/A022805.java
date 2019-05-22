package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054406;

/**
 * A022805 <code>a(n) = B(n) + C(n)</code> where <code>B(n)</code> is Beatty sequence <code>[ n*sqrt(3) ]</code> and C is complement of B.
 * @author Sean A. Irvine
 */
public class A022805 implements Sequence {

  private final Sequence mA = new A022838();
  private final Sequence mB = new A054406();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
