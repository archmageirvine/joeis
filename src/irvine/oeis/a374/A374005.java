package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A374005 a(n) = (1 + (n+4)^2 + (n-5)*(-1)^n)/2.
 * @author Georg Fischer
 */
public class A374005 extends LambdaSequence {

  /** Construct the sequence. */
  public A374005() {
    super(1, n -> Z.valueOf(n + 4).square().add(Z.NEG_ONE.pow(n).multiply(n - 5)).add(1).divide(2));
  }
}
