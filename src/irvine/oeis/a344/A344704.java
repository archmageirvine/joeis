package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A344704 a(n) = gcd(A001615(n)-n, sigma(n)-(A001615(n)+n)).
 * @author Georg Fischer
 */
public class A344704 extends LambdaSequence {

  /** Construct the sequence. */
  public A344704() {
    super(1, n -> Functions.GCD.z(Functions.DEDEKIND_PSI.z(n).subtract(n), Functions.SIGMA1.z(n).subtract(Functions.DEDEKIND_PSI.z(n).add(n))));
  }
}
