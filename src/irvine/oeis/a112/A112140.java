package irvine.oeis.a112;

import irvine.oeis.FiniteSequence;

/**
 * A112140 <code>(a(2n)+a(2n+1))^2 = a(2n) + 10000*a(2n+1)</code>.
 * @author Georg Fischer
 */
public class A112140 extends FiniteSequence {

  /** Construct the sequence. */
  public A112140() {
    super(0, 0, 1, 0, 1729, 494, 1984, 744, 2500, 2450, 2500, 2550, 1984, 5288, 1729, 6048, 1, 9998, 0, 10000);
  }
}
