package irvine.oeis.a101;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.z.Z;
import irvine.oeis.a033.A033676;
import irvine.oeis.a033.A033677;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A101322 a(n) = n - (least divisor of n &gt;= the square root of n) + (greatest divisor of n &lt;= the square root of n).
 * @author Georg Fischer
 */
public class A101322 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A101322() {
    super(1, (self, n) -> Z.valueOf(n).add(self.s(0)).subtract(self.s(1)), "", new A033676(), new A033677());
  }
}
