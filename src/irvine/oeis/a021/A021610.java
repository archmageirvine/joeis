package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021610 Decimal expansion of 1/606.
 * @author Sean A. Irvine
 */
public class A021610 extends PrependSequence {

  /** Construct the sequence. */
  public A021610() {
    super(new PeriodicSequence(0, 1, 6, 5), 0);
  }
}

