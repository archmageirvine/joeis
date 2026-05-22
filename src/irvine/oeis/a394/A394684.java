package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.a036.A036702;
import irvine.oeis.a063.A063014;

/**
 * A394684 allocated for Evan Balster.
 * @author Sean A. Irvine
 */
public class A394684 extends Combiner {

  /** Construct the sequence. */
  public A394684() {
    super(0, new A036702(), new A063014(), SUBTRACT);
  }
}

