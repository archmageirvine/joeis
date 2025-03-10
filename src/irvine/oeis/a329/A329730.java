package irvine.oeis.a329;
// Generated by gen_seq4.pl 2024-10-29.ack/filnum at 2024-10-29 23:15

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A329730 Numbers k such that usigma(uphi(k)) = uphi(usigma(k)), where usigma is the sum of unitary divisors function (A034448) and uphi is the unitary totient function (A047994).
 * @author Georg Fischer
 */
public class A329730 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A329730() {
    super(1, 1, k -> Functions.USIGMA1.z(Functions.UPHI.z(k)).equals(Functions.UPHI.z(Functions.USIGMA1.z(k))));
  }
}
