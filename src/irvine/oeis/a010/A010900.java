package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010900 Pisot sequence <code>E(4,13): a(n) = floor( a(n-1)^2/a(n-2) + 1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A010900 extends PisotSequence {

  /** Construct the sequence. */
  public A010900() {
    super(4, 13);
  }
}

