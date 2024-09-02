package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A072086 Number of steps to reach 1, starting with n and applying the A072084-map repeatedly.
 * @author Sean A. Irvine
 */
public class A072086 extends Sequence1 {

  private final DirectSequence mSeq = new A072084();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long count = 0;
    while (!Z.ONE.equals(t)) {
      t = mSeq.a(t);
      ++count;
    }
    return Z.valueOf(count);
  }
}
