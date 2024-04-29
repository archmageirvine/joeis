package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050315 Main diagonal of A050314.
 * @author Sean A. Irvine
 */
public class A050315 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final int index = Long.bitCount(++mN);
    return Functions.BELL.z(index);
  }
}
