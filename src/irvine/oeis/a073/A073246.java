package irvine.oeis.a073;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001113;

/**
 * A073246 Prime digits in the decimal expansion of e.
 * @author Sean A. Irvine
 */
public class A073246 extends FilterSequence {

  /** Construct the sequence. */
  public A073246() {
    super(0, new A001113(), PRIME);
  }
}
