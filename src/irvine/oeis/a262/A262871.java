package irvine.oeis.a262;

import irvine.oeis.DoubledSequence;
import irvine.oeis.a066.A066779;

/**
 * A262871 Sum of the squarefree numbers appearing among the smaller parts of the partitions of n into two parts.
 * @author Georg Fischer
 */
public class A262871 extends DoubledSequence {

  /** Construct the sequence. */
  public A262871() {
    super(1, 0, new A066779(), 0);
  }
}
