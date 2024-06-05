package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A059799 Primes which when added to their reversals are squares.
 * @author Sean A. Irvine
 */
public class A059799 extends FilterSequence {

  /** Construct the sequence. */
  public A059799() {
    super(new A000040(), k -> Functions.REVERSE.z(k).add(k).isSquare());
  }
}
