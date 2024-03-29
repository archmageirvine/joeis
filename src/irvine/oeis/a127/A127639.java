package irvine.oeis.a127;
// Generated by gen_seq4.pl trixint0/parmof2 at 2023-06-27 10:07

import irvine.oeis.a000.A000040;
import irvine.oeis.a130.A130162;

/**
 * A127639 A051731 * A127640, where A127640 = infinite lower triangular matrix with the sequence of primes in the main diagonal and the rest zeros.
 * @author Georg Fischer
 */
public class A127639 extends A130162 {

  /** Construct the sequence. */
  public A127639() {
    super(1, new A000040());
  }
}
