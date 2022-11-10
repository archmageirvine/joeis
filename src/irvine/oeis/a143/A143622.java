package irvine.oeis.a143;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A143622 a(n) = (-1)^binomial(n, 8): Periodic sequence 1, 1, 1, 1, 1, 1, 1, 1,-1,-1,-1,-1,-1,-1,-1,-1,... .
 * @author Georg Fischer
 */
public class A143622 extends PeriodicSequence {

  /** Construct the sequence. */
  public A143622() {
    super(1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1);
  }
}
