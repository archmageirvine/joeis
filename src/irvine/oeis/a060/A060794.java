package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a033.A033677;

/**
 * A060794 Difference between upper and lower central divisors of n.
 * @author Sean A. Irvine
 */
public class A060794 extends Combiner {

  /** Construct the sequence. */
  public A060794() {
    super(2, new A033677(), new A060775(), SUBTRACT);
    next();
  }
}
