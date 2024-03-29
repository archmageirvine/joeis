package irvine.oeis.a229;
// Generated by gen_seq4.pl manch4/hantraf at 2024-03-12 13:36

import irvine.oeis.a000.A000265;
import irvine.oeis.transform.HankelTransformSequence;

/**
 * A229628 Hankel transform of A000265 (odd part of n).
 * @author Georg Fischer
 */
public class A229628 extends HankelTransformSequence {

  /** Construct the sequence. */
  public A229628() {
    super(1, new A000265(), 0);
  }
}
