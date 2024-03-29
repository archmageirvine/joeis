package irvine.oeis.a184;
// Generated by gen_seq4.pl rootet at 2023-02-20 12:05

import irvine.oeis.transform.RootSequence;

/**
 * A184890 a(n) = C(2n,n) * (5^n/n!^2) * Product_{k=0..n-1} (5k+2)*(5k+3).
 * @author Georg Fischer
 */
public class A184890 extends RootSequence {

  /** Construct the sequence. */
  public A184890() {
    super(0, new A184889().skip(1), 2, 1);
  }
}
