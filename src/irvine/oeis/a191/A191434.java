package irvine.oeis.a191;
// Generated by gen_seq4.pl 2024-07-18/disperd at 2024-07-18 21:49

import irvine.math.cr.CR;
import irvine.oeis.triangle.DispersionArray;

/**
 * A191434 Dispersion of ([n*x+n+3/2]), where x=(golden ratio) and [ ]=floor, by antidiagonals.
 * @author Georg Fischer
 */
public class A191434 extends DispersionArray {

  /** Construct the sequence. */
  public A191434() {
    super(1, n -> CR.valueOf(n).multiply(CR.PHI.add(1)).add(1).add(CR.HALF).floor());
  }
}
