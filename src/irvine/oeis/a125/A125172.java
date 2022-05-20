package irvine.oeis.a125;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001906;
import irvine.oeis.triangle.Triangle;

/**
 * A125172 Triangle T(n,k) with partial column sums of the even indexed Fibonacci numbers.
 * @author Georg Fischer
 */
public class A125172 extends Triangle {

  private Sequence mSeq;

  /** Construct the sequence. */
  public A125172() {
    hasRAM(false);
    mSeq = new A001906();
    mSeq.next(); // skip 0
  }

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 ? mSeq.next() : (k == n ? Z.ONE : get(n - 2, k - 2).add(get(n - 2, k - 1)));
  }
}
