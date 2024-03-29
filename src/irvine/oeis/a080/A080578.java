package irvine.oeis.a080;
// Generated by gen_seq4.pl build/parmof4 at 2022-12-30 21:44

import irvine.oeis.a064.A064437;

/**
 * A080578 a(1)=1; for n &gt; 1, a(n) = a(n-1) + 1 if n is already in the sequence, a(n) = a(n-1) + 3 otherwise.
 * @author Georg Fischer
 */
public class A080578 extends A064437 {

  /** Construct the sequence. */
  public A080578() {
    super(1, 1, +1, +3);
  }
}
