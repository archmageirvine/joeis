package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007604 a(n)=a(n-1)+a(n-1- number of odd terms so far).
 * @author Sean A. Irvine
 */
public class A007604 extends MemorySequence {

  private int mOdd = 1;
  {
    setOffset(1);
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    } else {
      final Z a = get(n - 1).add(get(n - 1 - mOdd));
      if (a.isOdd()) {
        ++mOdd;
      }
      return a;
    }
  }
}
