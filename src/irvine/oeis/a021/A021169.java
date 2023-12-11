package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021169 Decimal expansion of 1/165.
 * @author Sean A. Irvine
 */
public class A021169 extends PrependSequence {

  /** Construct the sequence. */
  public A021169() {
    super(new PeriodicSequence(0, 6), 0);
  }
}
