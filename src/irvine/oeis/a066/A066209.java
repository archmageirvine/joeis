package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a053.A053041;

/**
 * A066209 A053041(n)-10^(n-1).
 * @author Georg Fischer
 */
public class A066209 extends A053041 {

  private Z mP10 = Z.ONE;

  @Override
  public Z next() {
    final Z result = super.next().subtract(mP10);
    mP10 = mP10.multiply(10);
    return result;
  }
}
