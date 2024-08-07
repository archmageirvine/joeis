package irvine.oeis.a128;
// Generated by gen_seq4.pl 2024-05-27/multrar at 2024-05-28 02:23

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A128195 a(n) = (2*n + 1)*(a(n - 1) + 2^n) for n &gt;= 1, a(0) = 1.
 * @author Georg Fischer
 */
public class A128195 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A128195() {
    super(0, (self, n) -> Z.valueOf(2L * n + 1).multiply(self.a(n - 1).add(Z.TWO.pow(n))), "1, 9");
  }
}
