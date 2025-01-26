package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;

/**
 * A064575 First differences of A064572, where A064572(n) is the number of ways to partition n into parts which are all powers of some integer.
 * @author Sean A. Irvine
 */
public class A064575 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064575() {
    super(1, new A064572());
  }
}

