package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-02-02/parmof2 at 2024-02-03 12:44

import irvine.oeis.a010.A010371;

/**
 * A357971 a(n) is the number of segments used to represent the time of n minutes past midnight in the format hh:mm on a 7-segment calculator display; version where the digits '6', '7' and '9' use 6, 4 and 6 segments, respectively.
 * @author Georg Fischer
 */
public class A357971 extends A357970 {

  /** Construct the sequence. */
  public A357971() {
    super(0, new A010371());
  }
}
