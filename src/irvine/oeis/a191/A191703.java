package irvine.oeis.a191;
// Generated by gen_seq4.pl 2024-07-18/disperd at 2024-07-18 21:49

import irvine.oeis.a016.A016861;
import irvine.oeis.triangle.DispersionArray;

/**
 * A191703 Dispersion of A016861, (5k+1), by antidiagonals.
 * @author Georg Fischer
 */
public class A191703 extends DispersionArray {

  /** Construct the sequence. */
  public A191703() {
    super(1, new A016861());
  }
}
