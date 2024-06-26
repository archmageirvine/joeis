package irvine.oeis.a097;
// Generated by gen_seq4.pl 2024-06-01/multrar at 2024-06-01 22:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A097043 a(n) = n - a(floor(sqrt(n))) for n &gt; 1; a(1) = 1.
 * @author Georg Fischer
 */
public class A097043 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A097043() {
    super(1, (self, n) -> Z.valueOf(n).subtract(self.a(Functions.SQRT.i(n))), "1");
  }
}
