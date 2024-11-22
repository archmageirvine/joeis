package irvine.oeis.a073;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000796;

/**
 * A073264 Prime digits in the decimal expansion of Pi (with repetitions, in order of appearance).
 * @author Sean A. Irvine
 */
public class A073264 extends FilterSequence {

  /** Construct the sequence. */
  public A073264() {
    super(1, new A000796(), PRIME);
  }
}

