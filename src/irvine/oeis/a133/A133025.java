package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133025 Divisors of 33550336, the 5th perfect number.
 * @author Georg Fischer
 */
public class A133025 extends FiniteSequence {

  /** Construct the sequence. */
  public A133025() {
    super(1, FINITE, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8191, 16382, 32764, 65528, 131056, 262112, 524224, 1048448, 2096896, 4193792, 8387584, 16775168, 33550336);
  }
}
