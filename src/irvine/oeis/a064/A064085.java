package irvine.oeis.a064;

import irvine.oeis.Combiner;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000225;

/**
 * A064085 Quotient of A000225 and A064084.
 * @author Sean A. Irvine
 */
public class A064085 extends Combiner {

  /** Construct the sequence. */
  public A064085() {
    super(new SkipSequence(new A000225(), 1), new A064084(), DIVIDE);
  }
}
