package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109756 If you sum 3 consecutive odd prime numbers p,q,r, you get a number s which is either prime or not: <code>p+q+r=s</code>. If s is prime, you call it p and repeat the game. If s is not prime, you call the largest prime factor p and repeat the game. Finally, you get into an infinite cycle, which is one of the above 3 sequences, no matter what initial prime numbers you choose.
 * @author Georg Fischer
 */
public class A109756 extends FiniteSequence {

  /** Construct the sequence. */
  public A109756() {
    super(7, 31, 109, 349, 1061, 103, 29, 97, 43, 13, 11, 41, 131, 37, 17, 59);
  }
}
