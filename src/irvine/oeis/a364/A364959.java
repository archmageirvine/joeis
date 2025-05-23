package irvine.oeis.a364;
// Generated by gen_seq4.pl 2025-05-02.ack/filnum at 2025-05-02 12:03

import irvine.oeis.DirectSequence;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a348.A348717;

/**
 * A364959 Odd numbers k such that A348717(k) = A348717(A005940(k)).
 * @author Georg Fischer
 */
public class A364959 extends FilterNumberSequence {

  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A348717 = new A348717();

  /** Construct the sequence. */
  public A364959() {
    super(1, 0, k -> (k & 1) == 1 && A348717.a(k).equals(A348717.a(A005940.a(k))));
  }
}
