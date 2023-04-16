package irvine.oeis.a247;
// manually interleave at 2023-04-16 16:45

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000861;

/**
 * A247361 Interleave A000861\{0} and A247359: positive numbers with English name ending in a vowel resp. consonant.
 * @author Georg Fischer
 */
public class A247361 extends AlternatingSequence {

  /** Construct the sequence. */
  public A247361() {
    super(1, new A000861() {
      {
        super.next();
      }
    }, new A247359());
  }
}
