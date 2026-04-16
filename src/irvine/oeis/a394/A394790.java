package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000203;
import irvine.oeis.a001.A001511;

/**
 * A394790 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A394790 extends Combiner {

  /** Construct the sequence. */
  public A394790() {
    super(1, new A000203(), new A001511(), MULTIPLY);
  }
}
