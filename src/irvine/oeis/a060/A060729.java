package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A060729 a(n+1) = a(n) + a(n minus the number of terms of the same parity as n so far).
 * @author Sean A. Irvine
 */
public class A060729 extends MemorySequence {

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
    if (n == 1) {
      return Z.TWO;
    }
    final int parityAdjust = (n & 1) == 1 ? mOdd : (n - mOdd);
    final Z t = a(n - 1).add(a(n - 1 - parityAdjust));
    if (t.isOdd()) {
      ++mOdd;
    }
    return t;
  }
}

