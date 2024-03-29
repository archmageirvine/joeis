package irvine.oeis.a323;
// Generated by gen_seq4.pl 2023-12-27/filter at 2023-12-27 11:35

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A323617 Primes p such that 3 is a primitive root modulo p while 243 is not.
 * @author Georg Fischer
 */
public class A323617 extends FilterSequence {

  /** Construct the sequence. */
  public A323617() {
    super(1, new A000040().skip(1), p -> new IntegersModMul(p).order(Z.THREE).equals(p.subtract(1)) && p.mod(5) == 1);
  }
}
