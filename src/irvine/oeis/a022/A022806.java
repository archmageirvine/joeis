package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a054.A054385;

/**
 * A022806 a(n) = B(n) + c(n) where B(n) is Beatty sequence [ n*e ] and c is the complement of B.
 * @author Sean A. Irvine
 */
public class A022806 extends Sequence1 {

  private final Sequence mA = new A022843().skip(1);
  private final Sequence mB = new A054385();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
