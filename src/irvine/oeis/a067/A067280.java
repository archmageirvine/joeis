package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003285;

/**
 * A067280 Number of terms in continued fraction for sqrt(n), excl. 2nd and higher periods.
 * @author Georg Fischer
 */
public class A067280 extends Sequence1 {

  private final Sequence mA003285 = new A003285();

  @Override
  public Z next() {
    return mA003285.next().add(Z.ONE);
  }
}
