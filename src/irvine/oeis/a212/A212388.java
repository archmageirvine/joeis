package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A212388 Number of Dyck n-paths all of whose ascents have lengths equal to 1 (mod 8).
 * 1+x*A(x)/(1-(x*A(x))^8)
 * @author Georg Fischer
 */
public class A212388 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A212388() {
    super(0, "[[1]]", ";1;x;A;*;1;x;A;*;^8;-;/;+", 0, 0);
  }
}
