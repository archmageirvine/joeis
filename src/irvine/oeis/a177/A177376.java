package irvine.oeis.a177;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A177376 Fibonacci numbers whose decimal expansion does not contain any digit 9.
 * @author Georg Fischer
 */
public class A177376 extends FilterSequence {

  /** Construct the sequence. */
  public A177376() {
    super(1, new A000045().skip(1), v -> ZUtils.digitCounts(v)[9] == 0);
  }
}
