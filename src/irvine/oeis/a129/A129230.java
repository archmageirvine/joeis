package irvine.oeis.a129;
// Generated by gen_seq4.pl 2025-03-07.ack/partsun at 2025-03-07 21:14

import irvine.oeis.PartialSumSequence;

/**
 * A129230 a(n) = floor(n*r) + floor((n-2)*r) + floor((n-4)*r) + ... + floor(k*r), where r = golden ratio = (1 + sqrt(5))/2 and k = n mod 2.
 * @author Georg Fischer
 */
public class A129230 extends PartialSumSequence {

  /** Construct the sequence. */
  public A129230() {
    super(0, new A129229());
  }
}
