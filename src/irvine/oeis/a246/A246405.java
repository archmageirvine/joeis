package irvine.oeis.a246;
// Generated by gen_seq4.pl 2025-02-16.ack/filnumr at 2025-02-16 22:50

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.FilterNumberSequence;

/**
 * A246405 Nonnegative integers k satisfying sec(k) &gt; sec(k+1) &lt; sec(k+2).
 * @author Georg Fischer
 */
public class A246405 extends FilterNumberSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A246405() {
    super(1, 0, k -> {
      final CR sk1 = REALS.sec(CR.valueOf(k + 1));
      return REALS.sec(CR.valueOf(k)).compareTo(sk1) > 0 && sk1.compareTo(REALS.sec(CR.valueOf(k + 2))) < 0;
    });
  }
}
