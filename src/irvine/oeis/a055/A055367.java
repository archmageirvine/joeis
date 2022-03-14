package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055367 Number of asymmetric mobiles (circular rooted trees) with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055367 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055367() {
    super(7, A055278.computeRecurrence(6), "1, 8, 45, 190, 672, 2045, 5580, 13868, 31968, 69069, 141284, 275484, 515296, 928952, 1620895, 2746538, 4533060, 7305216, 11520492, 17811767, 27043799, 40380695, 59373007, 86060337, 123101225, 173924181, 242915666, 335636501", 0);
  }
}

