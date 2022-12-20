package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a053.A053292;

/**
 * A060720 Singular n X n matrices over GF(5).
 * @author Sean A. Irvine
 */
public class A060720 extends Combiner {

  /** Construct the sequence. */
  public A060720() {
    super(1, new A060758(), new A053292(), SUBTRACT);
    next();
  }
}
