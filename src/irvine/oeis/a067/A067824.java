package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a002.A002033;

/**
 * A067824 a(1) = 1; for n &gt; 1, a(n) = 1 + Sum_{0 &lt; d &lt; n, d|n} a(d).
 * @author Georg Fischer
 */
public class A067824 extends A002033 {

  private int mN = 0;

  /**
   * Construct the sequence
   */
  public A067824() {
    setOffset(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mN == 1 ? Z.ONE : Z.TWO);
  }
}
