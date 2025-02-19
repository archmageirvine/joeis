package irvine.oeis.a214;
// Generated by gen_seq4.pl 2025-02-18.ack/filnum at 2025-02-18 23:09

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A214585 Numbers k such that gcd(k!!+1,k-1) &gt; 1.
 * @author Georg Fischer
 */
public class A214585 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A214585() {
    super(1, 1, k -> Functions.GCD.z(Functions.MULTIFACTORIAL.z(2, k).add(1), Z.valueOf(k - 1)).compareTo(1) > 0);
  }
}
