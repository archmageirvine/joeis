package irvine.oeis.a010;

import irvine.math.LongUtils;
import irvine.oeis.PeriodicSequence;

/**
 * A010881 Simple periodic sequence: n mod 12.
 * @author Sean A. Irvine
 */
public class A010881 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010881() {
    super(LongUtils.identity(12));
  }
}

