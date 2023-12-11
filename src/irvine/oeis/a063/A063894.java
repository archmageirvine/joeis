package irvine.oeis.a063;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A063894 Start with x, y; then concatenate each word in turn with all preceding words, getting x y xy xxy yxy xxxy yxxy xyxxy ...; sequence gives number of words of length n. Also binary trees by degree: x y (x,y) (x,(x,y)) (y,(x,y)) (x,(x,(x,y))) (y,(x,(x,y))) ((x,y),(x,(x,y)))...
 * @author Sean A. Irvine
 */
public class A063894 extends Sequence1 {

  private final MemorySequence mSeq = new MemorySequence() {
    {
      add(null);
    }

    @Override
    protected Z computeNext() {
      final int n = size();
      if (n == 1) {
        return Z.TWO;
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
