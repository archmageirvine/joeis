package irvine.oeis.a082;

import irvine.oeis.FilterSequence;

/**
 * A082933 Even elements of A082931.
 * @author Sean A. Irvine
 */
public class A082933 extends FilterSequence {

  /** Construct the sequence. */
  public A082933() {
    super(1, new A082931(), EVEN);
  }
}
