package irvine.oeis.a284;
// Generated by gen_seq4.pl 2025-05-08.ack/filter at 2025-05-08 13:52

import irvine.oeis.FilterSequence;

/**
 * A284268 Sum of coefficients &gt; 1 in the Stern polynomial B(2n+1,x): a(n) = A275812(A277324(n)).
 * @author Georg Fischer
 */
public class A284268 extends FilterSequence {

  /** Construct the sequence. */
  public A284268() {
    super(0, new A284272(), (n, v) -> (n & 1) == 1);
  }
}
