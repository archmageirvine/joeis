package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021039 Decimal expansion of 1/35.
 * @author Sean A. Irvine
 */
public class A021039 extends PrependSequence {

  /** Construct the sequence. */
  public A021039() {
    super(new PeriodicSequence(2, 8, 5, 7, 1, 4), 0);
  }
}
