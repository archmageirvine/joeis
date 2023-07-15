package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;

/**
 * A064194 a(2n) = 3*a(n), a(2n+1) = 2*a(n+1)+a(n), with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A064194 extends Sequence1 {

  private MemorySequence mSeq = new MemorySequence() {
    {
      add(null);
    }

    @Override
    protected Z computeNext() {
      final int n = size();
      if (n == 1) {
        return Z.ONE;
      }
      return (n & 1) == 0 ? a(n / 2).multiply(3) : a(n / 2).add(a(n / 2 + 1).multiply2());
    }
  };

  @Override
  public Z next() {
    return mSeq.next();
  }
}

