package irvine.oeis.a194;
// manually interleave at 2021-11-02 15:18

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000041;

/**
 * A194451 Partition numbers of positive integers and positive integers interleaved.
 * @author Georg Fischer
 */
public class A194451 extends AlternatingSequence {

  /** Construct the sequence. */
  public A194451() {
    super(1, new A000041().skip(1), new A000027());
  }
}
