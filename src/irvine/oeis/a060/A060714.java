package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A060714 a(n) = a(n-1) + a(n-1 minus the number of terms of the same parity as n so far).
 * @author Sean A. Irvine
 */
public class A060714 extends MemorySequence {

  private int mOdd = 0;
  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      ++mOdd;
      return Z.ONE;
    }
    final int parityAdjust = (n & 1) == 0 ? mOdd : (n - mOdd);
    final Z t = a(n - 1).add(a(n - 1 - parityAdjust));
    if (t.isOdd()) {
      ++mOdd;
    }
    return t;
  }
}
