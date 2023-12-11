package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006852;
import irvine.oeis.memory.MemorySequence;

/**
 * A038834 Past of komet 'k2' (A038807).
 * @author Sean A. Irvine
 */
public class A038834 extends Sequence0 {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A006852());
  private int mA = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 2;
      return Z.TWO;
    }
    mA = mSeq.a(mA - 1).intValueExact();
    return Z.valueOf(mA);
  }
}
