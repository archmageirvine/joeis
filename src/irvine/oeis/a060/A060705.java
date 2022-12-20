package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a053.A053290;

/**
 * A060705 Singular n X n matrices over GF(3).
 * @author Sean A. Irvine
 */
public class A060705 extends Combiner {

  /** Construct the sequence. */
  public A060705() {
    super(1, new A060722(), new A053290(), SUBTRACT);
    next();
  }
}
