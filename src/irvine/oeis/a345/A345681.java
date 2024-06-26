package irvine.oeis.a345;
// Generated by gen_seq4.pl 2024-04-22/multraf at 2024-04-22 22:28

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A345681 a(0) = 0; for n &gt;= 1, a(n) = A004185(a(n-1)+n).
 * @author Georg Fischer
 */
public class A345681 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A345681() {
    super(0, (self, n) -> Functions.DIGIT_SORT_ASCENDING.z(self.a(n - 1).add(n)), "0");
  }
}
