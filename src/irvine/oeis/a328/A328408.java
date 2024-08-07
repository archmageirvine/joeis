package irvine.oeis.a328;
// Generated by gen_seq4.pl 2024-08-04/multrar at 2024-08-04 18:23

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A328408 G.f. A(x) satisfies: A(x) = A(x^2) + x * (1 + 4*x + x^2) / (1 - x)^4.
 * @author Georg Fischer
 */
public class A328408 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A328408() {
    super(1, (self, n) -> {
      final int h = n / 2;
      return ((n & 1) == 0) ? self.a(h).add(Z.valueOf(h).pow(3).multiply(8)) : Z.valueOf(2 * h + 1).pow(3);
    }, "");
  }
}
