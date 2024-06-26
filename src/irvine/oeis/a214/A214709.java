package irvine.oeis.a214;
// Generated by gen_seq4.pl A060035/parmof3 at 2022-05-06 21:45

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060035;

/**
 * A214709 Least m&gt;0 such that n!-m and 2^n-m are relatively prime.
 * @author Georg Fischer
 */
public class A214709 extends A060035 {

  /** Construct the sequence. */
  public A214709() {
    super(1, 1, (n, m) -> Functions.FACTORIAL.z(n).subtract(m).gcd(Z.ONE.shiftLeft(n).subtract(m)).equals(Z.ONE));
  }
}
