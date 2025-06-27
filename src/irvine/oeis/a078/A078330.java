package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A078330 Primes p such that mu(p-1) = -1, where mu is the Moebius function; that is, p-1 is squarefree and has an odd number of prime factors.
 * @author Sean A. Irvine
 */
public class A078330 extends FilterSequence {

  /** Construct the sequence. */
  public A078330() {
    super(1, new A000040(), p -> Functions.MOBIUS.i(p.subtract(1)) == -1);
  }
}

