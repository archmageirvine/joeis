package irvine.oeis.a336;
// manually 2023-10-27

import irvine.oeis.MultiplicativeSequence;

/**
 * A336466 Fully multiplicative with a(p) = A000265(p-1) for any prime p, where A000265(k) gives the odd part of k.
 * Formula: <code>a(n) = A000265(A003958(n)).</code>
 * @author Georg Fischer
 */
public class A336466 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A336466() {
    super(1, (p, e) -> p.subtract(1).makeOdd().pow(e));
  }
}
