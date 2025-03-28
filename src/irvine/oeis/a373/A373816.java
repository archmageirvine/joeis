package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-10-28.ack/holos at 2024-10-28 19:20

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A373816 Expansion of 1/(2 - 1/(1 - 4*x)^(3/2)).
 * 1/(2-1/(1-4*x)^(3/2))
 * @author Georg Fischer
 */
public class A373816 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A373816() {
    super(0, "[[0],[71680,-34816, 4096],[-61440, 35840,-5120],[19200,-14080, 2560],[-2280, 2424,-624],[90,-162, 72],[0, 3,-3]]", "1, 6, 66, 716, 7746, 83748, 905332", 0, 0);
  }
}
