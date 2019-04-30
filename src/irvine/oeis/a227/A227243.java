package irvine.oeis.a227;

import irvine.oeis.FiniteSequence;

/**
 * A227243 Powerful numbers n such that <code>n/phi(n) &gt;=</code> e^gamma*log log n.
 * @author Georg Fischer
 */
public class A227243 extends FiniteSequence {

  /** Construct the sequence. */
  public A227243() {
    super(4, 8, 9, 16, 36, 72, 108, 144, 216, 900, 1800, 2700, 3600, 44100, 88200);
  }
}
