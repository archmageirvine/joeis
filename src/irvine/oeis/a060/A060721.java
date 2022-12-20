package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a053.A053293;

/**
 * A060721 Singular n X n matrices over GF(7).
 * @author Sean A. Irvine
 */
public class A060721 extends Combiner {

  /** Construct the sequence. */
  public A060721() {
    super(1, new A060759(), new A053293(), SUBTRACT);
    next();
  }
}
