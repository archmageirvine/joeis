package irvine.oeis.a291;

import irvine.oeis.FiniteSequence;

/**
 * A291715 <code>a(n) =</code> 420*(preferred ratios of room width / height in Alberti's Ten Books on Architecture).
 * @author Georg Fischer
 */
public class A291715 extends FiniteSequence {

  /** Construct the sequence. */
  public A291715() {
    super(210, 252, 280, 315, 336, 350, 360, 420);
  }
}
