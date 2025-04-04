package irvine.oeis.a191;
// Generated by gen_seq4.pl 2024-07-18/disperd at 2024-07-18 21:49

import irvine.oeis.a004.A004937;
import irvine.oeis.triangle.DispersionArray;

/**
 * A191433 Dispersion of ([n*x+n+1/2]), where x=(golden ratio) and [ ]=floor, by antidiagonals.
 * @author Georg Fischer
 */
public class A191433 extends DispersionArray {

  /** Construct the sequence. */
  public A191433() {
    super(1, new A004937());
  }
}
