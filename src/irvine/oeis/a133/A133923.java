package irvine.oeis.a133;
// Generated by gen_seq4.pl 2024-07-07/multrar at 2024-07-07 23:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A133923 a(1)=1, and for n&gt;1, a(n) = a(n-1)/2, if a(n-1) is divisible by 2, otherwise a(n) = A000005(n*a(n-1)).
 * @author Georg Fischer
 */
public class A133923 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A133923() {
    super(1, (self, n) -> {
      final Z prev = self.a(n - 1);
      return prev.testBit(0) ? Functions.SIGMA0.z(self.a(n - 1).multiply(n)) : self.a(n - 1).divide(2);
    }, "1");
  }
}
