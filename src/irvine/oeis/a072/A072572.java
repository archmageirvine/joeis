package irvine.oeis.a072;

import irvine.oeis.FilterSequence;

/**
 * A072572 Odd interprimes divisible by 3.
 * @author Sean A. Irvine
 */
public class A072572 extends FilterSequence {

  /** Construct the sequence. */
  public A072572() {
    super(1, new A072569(), k -> k.mod(3) == 0);
  }
}
