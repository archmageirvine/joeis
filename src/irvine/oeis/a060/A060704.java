package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002416;
import irvine.oeis.a002.A002884;

/**
 * A060704 Singular n X n matrices over GF(2).
 * @author Georg Fischer
 */
public class A060704 extends Combiner {

  /** Construct the sequence. */
  public A060704() {
    super(1, new A002416(), new A002884(), SUBTRACT);
    next();
  }
}
