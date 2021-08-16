package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002808;

/**
 * A050438 Fourth-order composites.
 * @author Sean A. Irvine
 */
public class A050438 extends NestedSequence {

  /** Construct the sequence. */
  public A050438() {
    super(1, new A002808(), new A050436(), 1, 1);
  }
}
