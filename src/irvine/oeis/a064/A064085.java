package irvine.oeis.a064;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000225;

/**
 * A064085 Quotient of A000225 and A064084.
 * @author Sean A. Irvine
 */
public class A064085 extends Combiner {

  /** Construct the sequence. */
  public A064085() {
    super(1, new A000225().skip(1), new A064084(), DIVIDE);
  }
}
