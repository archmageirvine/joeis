package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021660 Decimal expansion of 1/656.
 * @author Sean A. Irvine
 */
public class A021660 extends PrependSequence {

  /** Construct the sequence. */
  public A021660() {
    super(new PeriodicSequence(2, 4, 3, 9, 0), 0, 0, 1, 5);
  }
}

