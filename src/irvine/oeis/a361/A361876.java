package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-07-18/disperd at 2024-07-18 21:49

import irvine.oeis.a065.A065091;
import irvine.oeis.triangle.DispersionArray;

/**
 * A361876 Dispersion of the odd primes: a rectangular array read by downward antidiagonals.
 * @author Georg Fischer
 */
public class A361876 extends DispersionArray {

  /** Construct the sequence. */
  public A361876() {
    super(1, new A065091());
  }
}
