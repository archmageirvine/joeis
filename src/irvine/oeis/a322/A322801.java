package irvine.oeis.a322;
// Generated by gen_seq4.pl 2023-11-26/parmof2 at 2023-11-26 23:29

import irvine.oeis.a005.A005891;
import irvine.oeis.a076.A076739;

/**
 * A322801 Number of compositions (ordered partitions) of n into centered pentagonal numbers (A005891).
 * @author Georg Fischer
 */
public class A322801 extends A076739 {

  /** Construct the sequence. */
  public A322801() {
    super(0, new A005891());
  }
}
