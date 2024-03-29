package irvine.oeis.a322;
// Generated by gen_seq4.pl 2023-11-26/parmof2 at 2023-11-26 23:29

import irvine.oeis.a000.A000566;
import irvine.oeis.a076.A076739;

/**
 * A322799 Number of compositions (ordered partitions) of n into heptagonal numbers (A000566).
 * @author Georg Fischer
 */
public class A322799 extends A076739 {

  /** Construct the sequence. */
  public A322799() {
    super(0, new A000566().skip(1));
  }
}
