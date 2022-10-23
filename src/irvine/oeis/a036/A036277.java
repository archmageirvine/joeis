package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A036277 Position of first term &gt; 2 in n-th row of Gilbreath array shown in A036262.
 * @author Sean A. Irvine
 */
public class A036277 extends Sequence0 {

  private int mN = -1;

  private static Sequence createAbs(final Sequence sequence, final int n) {
    if (n == 0) {
      return sequence;
    }
    return createAbs(new DifferenceSequence(sequence) {
      @Override
      public Z next() {
        return super.next().abs();
      }
    }, n - 1);
  }

  @Override
  public Z next() {
    final Sequence seq = createAbs(new A000040(), ++mN);
    long k = 1;
    while (seq.next().compareTo(Z.TWO) <= 0) {
      ++k;
    }
    return Z.valueOf(k);
  }
}

