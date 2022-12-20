package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a053.A053291;

/**
 * A060716 Singular n X n matrices over GF(4).
 * @author Sean A. Irvine
 */
public class A060716 extends Combiner {

  /** Construct the sequence. */
  public A060716() {
    super(1, new A060757(), new A053291(), SUBTRACT);
    next();
  }
}
