package irvine.oeis.a073;

import irvine.oeis.FilterSequence;

/**
 * A073171.
 * @author Sean A. Irvine
 */
public class A073249 extends FilterSequence {

  /** Construct the sequence. */
  public A073249() {
    super(1, new A073247(), k -> !k.isProbablePrime()
      && !k.subtract(1).isProbablePrime()
      && !k.add(1).isProbablePrime());
  }
}
