package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007604 <code>a(n)=a(n-1)+a(n-1-</code> number of odd terms so <code>far)</code>.
 * @author Sean A. Irvine
 */
public class A007604 extends MemorySequence {

  private int mOdd = 1;
  {
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    } else {
      final Z a = get(n - 1).add(get(n - 1 - mOdd));
      if (!a.isEven()) {
        ++mOdd;
      }
      return a;
    }
  }
}
