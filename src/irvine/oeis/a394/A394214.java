package irvine.oeis.a394;

import irvine.oeis.FilterSequence;

/**
 * A394214 Positive elements of A394213.
 * @author Sean A. Irvine
 */
public class A394214 extends FilterSequence {

  /** Construct the sequence. */
  public A394214() {
    super(1, new A394213(), POSITIVE);
  }
}
