package irvine.oeis.a098;
// Generated by gen_seq4.pl 2024-04-02/filter at 2024-04-02 23:05

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001481;

/**
 * A098961 Sums of two squares and divisible by 13.
 * @author Georg Fischer
 */
public class A098961 extends FilterSequence {

  /** Construct the sequence. */
  public A098961() {
    super(1, new A001481(), (k, v) -> k > 1 && v.mod(13) == 0);
  }
}
