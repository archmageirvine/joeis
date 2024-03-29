package irvine.oeis.a322;
// Generated by gen_seq4.pl 2023-11-26/parmof2 at 2023-11-26 23:29

import irvine.oeis.a002.A002413;
import irvine.oeis.a076.A076739;

/**
 * A322855 Number of compositions (ordered partitions) of n into heptagonal pyramidal numbers (A002413).
 * @author Georg Fischer
 */
public class A322855 extends A076739 {

  /** Construct the sequence. */
  public A322855() {
    super(0, new A002413().skip(1));
  }
}
