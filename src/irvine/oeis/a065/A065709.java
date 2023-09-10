package irvine.oeis.a065;

import irvine.oeis.FilterSequence;

/**
 * A065658.
 * @author Sean A. Irvine
 */
public class A065709 extends FilterSequence {

  /** Construct the sequence. */
  public A065709() {
    super(new A065607(), k -> k.mod(20) != 0);
  }
}
