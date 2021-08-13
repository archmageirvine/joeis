package irvine.oeis.a050;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050315 Main diagonal of A050314.
 * @author Sean A. Irvine
 */
public class A050315 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return BellNumbers.bell(Long.bitCount(++mN));
  }
}
