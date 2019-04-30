package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010916 Pisot sequence <code>E(8,10), a(n) = floor( a(n-1)^2/a(n-2) + 1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A010916 extends PisotSequence {

  /** Construct the sequence. */
  public A010916() {
    super(8, 10);
  }
}

