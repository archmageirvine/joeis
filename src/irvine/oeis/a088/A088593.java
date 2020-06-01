package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088593 <code>a(0)=18; a(n+1) =</code> largest odd factor of <code>3*a(n)+1;</code> stop when <code>a(n)=1</code>.
 * @author Georg Fischer
 */
public class A088593 extends FiniteSequence {

  /** Construct the sequence. */
  public A088593() {
    super(18, 55, 83, 125, 47, 71, 107, 161, 121, 91, 137, 103, 155, 233, 175, 263, 395, 593, 445, 167, 251, 3, 77, 283, 425, 319, 479, 719, 1079, 1619, 2429, 911, 1367, 2051, 3077, 577, 433, 325, 61, 23, 35, 53, 5, 1);
  }
}
