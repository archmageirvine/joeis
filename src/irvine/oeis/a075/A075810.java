package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056913;

/**
 * A075800.
 * @author Sean A. Irvine
 */
public class A075810 extends FilterSequence {

  /** Construct the sequence. */
  public A075810() {
    super(1, new A056913(), PALINDROME);
  }
}
