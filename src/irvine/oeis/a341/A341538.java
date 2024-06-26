package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-05-13/multrar at 2024-05-13 22:33

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A341538 One of the two successive approximations up to 2^n for 2-adic integer sqrt(17). This is the 1 (mod 4) case.
 * @author Georg Fischer
 */
public class A341538 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A341538() {
    super(2, (self, n) -> self.a(n - 1).square().subtract(17).mod(Z.TWO.pow(n + 1)).isZero() ? self.a(n - 1) : self.a(n - 1).add(Z.TWO.pow(n - 1)), "1");
  }
}
