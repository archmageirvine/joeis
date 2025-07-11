package irvine.oeis.a344;
// Generated by gen_seq4.pl 2025-05-27.ack/filnum at 2025-05-27 23:49

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a048.A048105;

/**
 * A344732 Numbers k such that k divides Sum_{j=1..k} A048105(j).
 * @author Georg Fischer
 */
public class A344732 extends FilterNumberSequence {

  private static final DirectSequence A048105 = new A048105();

  /** Construct the sequence. */
  public A344732() {
    super(1, 1, k -> Integers.SINGLETON.sum(1, k, j -> A048105.a(j)).mod(k) == 0);
  }
}
