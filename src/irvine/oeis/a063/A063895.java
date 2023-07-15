package irvine.oeis.a063;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;

/**
 * A063895 Start with x, xy; then concatenate each word in turn with all preceding words, getting x xy xxy xxxy xyxxy xxxxy xyxxxy xxyxxxy ...; sequence gives number of words of length n. Also binary trees by degree: x (x,y) (x,(x,y)) (x,(x,(x,y))) ((x,y),(x,(x,y)))...
 * @author Sean A. Irvine
 */
public class A063895 extends Sequence1 {

  private MemorySequence mSeq = new MemorySequence() {
    {
      add(null);
    }

    @Override
    protected Z computeNext() {
      final int n = size();
      if (n <= 2) {
        return Z.ONE;
      }
      final Z sum = Integers.SINGLETON.sum(1, (n - 1) / 2, k -> a(k).multiply(a(n - k)));
      return (n & 1) == 0 ? sum.add(a(n / 2).subtract(1).multiply(a(n / 2)).divide2()) : sum;
    }
  };

  @Override
  public Z next() {
    return mSeq.next();
  }
}

