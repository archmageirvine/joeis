package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A106015 Primes p such that 4*p +- 3 are primes.
 * @author Georg Fischer
 */
public class A106015 extends FilterSequence {

  /** Construct the sequence. */
  public A106015() {
    super(1, new A000040(), p -> {
      final Z pp = p.multiply(4);
      return pp.add(3).isProbablePrime() && pp.subtract(3).isProbablePrime();
    });
  }
}
