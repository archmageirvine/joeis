package irvine.oeis.a350;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.a000.A000726;
import irvine.oeis.a066.A066447;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A350636 a(n) is the number of partitions of n in which no part is divisible by 3 minus the number of basis partitions of n.
 * @author Georg Fischer
 */
public class A350636 extends PairTransformSequence {

  /** Construct the sequence. */
  public A350636() {
    super(0, new A000726(), new A066447(), (n, u, v) -> u.subtract(v));
  }
}
