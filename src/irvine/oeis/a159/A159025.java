package irvine.oeis.a159;
// Generated by gen_seq4.pl 2024-06-01/multrar at 2024-06-01 22:47

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A159025 a(0)=71; a(n) = a(n-1) + floor(sqrt(a(n-1))), n &gt; 0.
 * @author Georg Fischer
 */
public class A159025 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A159025() {
    super(0, (self, n) -> self.a(n - 1).add(Functions.SQRT.z(self.a(n - 1))), "71");
  }
}
