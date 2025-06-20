package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078177 Composite numbers with an integer arithmetic mean of all prime factors.
 * @author Sean A. Irvine
 */
public class A078177 extends FilterSequence {

  /** Construct the sequence. */
  public A078177() {
    super(1, new A078175(), k -> !k.isProbablePrime());
  }
}
