package irvine.oeis.a274;
// manually 2021-07-20

import irvine.oeis.NoncomputableSequence;

/**
 * A274767 Decimal expansion of the googol-th prime.
 * From http://math.stackexchange.com/questions/1848854/how-many-digits-of-the-googol-th-prime-can-we-calculate-or-were-calculated
 * @author Georg Fischer
 */
public class A274767 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A274767() {
    super(2, 3, 4, 7, 1, 2, 5);
  }
}
