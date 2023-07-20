package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001001;
import irvine.oeis.a060.A060640;

/**
 * A027844 Number of subgroups of index n of fundamental group of the non-orientable cycle bundle over the Klein bottle.
 * @author Sean A. Irvine
 */
public class A027844 extends A001001 {

  // After Gheorghe Coserea

  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A060640(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    Z a = mA.a(++mN);
    if ((mN & 1) == 0) {
      a = a.add(super.next()).add(mA.a(mN / 2));
      if ((mN & 3) == 0) {
        a = a.subtract(mA.a(mN / 4).multiply2());
      }
    }
    return a;
  }
}
