package irvine.oeis.a106;
// Generated by gen_seq4.pl complem at 2023-09-11 12:58

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a014.A014076;

/**
 * A106092 Even numbers and primes.
 * @author Georg Fischer
 */
public class A106092 extends ComplementSequence {

  /** Construct the sequence. */
  public A106092() {
    super(1, new A014076(), Z.ONE);
  }
}
