package irvine.oeis.a214;
// Generated by gen_seq4.pl 2024-04-08/filter at 2024-04-08 19:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A214179 Primes p such that least positive primitive root of p is equal to number of 1's in binary representation of p.
 * @author Georg Fischer
 */
public class A214179 extends FilterSequence {

  /** Construct the sequence. */
  public A214179() {
    super(1, new A000040(), p -> Functions.LEAST_PRIMITIVE_ROOT.z(p).equals(Z.valueOf(p.bitCount())));
  }
}
