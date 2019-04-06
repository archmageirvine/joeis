package irvine.oeis.a035;

import irvine.oeis.FiniteSequence;

/**
 * A035033 Numbers n such that n &lt;= d(n)^2, where d() = number of divisors (A000005).
 * @author Georg Fischer
 */
public class A035033 extends FiniteSequence {

  /** Construct the sequence. */
  public A035033() {
    super(1, 2, 3, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 24, 28, 30, 32, 36, 40, 42, 48, 54, 56, 60, 72, 80, 84, 90, 96, 108, 120, 126, 132, 140, 144, 168, 180, 192, 210, 216, 240, 252, 288, 300, 336, 360, 420, 480, 504, 540, 720, 840, 1260);
  }
}
