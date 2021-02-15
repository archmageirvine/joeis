package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007063;

/**
 * A038807 Future of the smallest-perizeroin komet in Kimberling's expulsion array (A035486).
 * @author Sean A. Irvine
 */
public class A038807 implements Sequence {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A007063());
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
