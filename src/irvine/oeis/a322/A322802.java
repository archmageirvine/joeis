package irvine.oeis.a322;
// Generated by gen_seq4.pl 2023-11-26/parmof2 at 2023-11-26 23:29

import irvine.oeis.a003.A003215;
import irvine.oeis.a076.A076739;

/**
 * A322802 Number of compositions (ordered partitions) of n into centered hexagonal numbers (A003215).
 * @author Georg Fischer
 */
public class A322802 extends A076739 {

  /** Construct the sequence. */
  public A322802() {
    super(0, new A003215());
  }
}
