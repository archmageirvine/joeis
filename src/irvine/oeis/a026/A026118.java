package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039658;
import irvine.oeis.memory.MemorySequence;

/**
 * A026118 Number of polyhexes of class PF2 (with two catafusenes annealated to pyrene).
 * @author Sean A. Irvine
 */
public class A026118 extends A039658 {

  /** Construct the sequence. */
  public A026118() {
    super(6);
  }

  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private int mN = 1;

  {
    super.next(); // skip n == 1 in A039658
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(mA.a(k).multiply(mA.a(mN - k)));
    }
    sum = sum.multiply(13).add(super.next());
    if ((mN & 1) == 0) {
      sum = sum.add(mA.a(mN / 2).multiply(6));
    }
    return sum.divide(4);
  }
}
