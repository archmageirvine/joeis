package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010915 Pisot sequence <code>E(6,16), a(n) = floor( a(n-1)^2/a(n-2) + 1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A010915 extends PisotSequence {

  /** Construct the sequence. */
  public A010915() {
    super(6, 16);
  }
}

