package irvine.oeis.a072;

import irvine.oeis.FilterSequence;

/**
 * A072573 Odd interprimes not divisible by 3.
 * @author Sean A. Irvine
 */
public class A072573 extends FilterSequence {

  /** Construct the sequence. */
  public A072573() {
    super(1, new A072569(), k -> k.mod(3) != 0);
  }
}
