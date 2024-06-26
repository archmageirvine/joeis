package irvine.oeis.a079;
// Generated by gen_seq4.pl 2023-12-27/lambdan at 2023-12-27 11:35

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A079530 a(n) = phi(n) - ceiling(sqrt(n)).
 * @author Georg Fischer
 */
public class A079530 extends LambdaSequence {

  /** Construct the sequence. */
  public A079530() {
    super(1, n -> {
      Z r = Z.valueOf(n).root(2);
      r = r.add(1 - r.auxiliary());
      return Functions.PHI.z(n).subtract(r);
    });
  }
}
