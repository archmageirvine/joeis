package irvine.oeis.a151;
// manually 2024-04-25

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A151568 a(0)=1, a(1)=1; a(2^i+j)=2*a(j)+a(j+1) for 0 &lt;= j &lt; 2^i.
 * @author Georg Fischer
 */
public class A151568 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A151568() {
    this(0, 2, 1, "1, 1");
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param mul1 first multiplicant
   * @param mul2 second multiplicant
   * @param init initial terms
   */
  public A151568(final int offset, final int mul1, final int mul2, final String inits) {
    super(0, (self, n) -> {
      final int j = n - Integer.highestOneBit(n);
      return self.a(j).multiply(mul1).add(self.a(j + 1).multiply(mul2));
    }, inits);
  }
}
