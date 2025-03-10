package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075800.
 * @author Sean A. Irvine
 */
public class A075808 extends FilterSequence {

  /** Construct the sequence. */
  public A075808() {
    super(1, new A075800(), k -> k.isOdd() && !k.isProbablePrime());
  }
}
