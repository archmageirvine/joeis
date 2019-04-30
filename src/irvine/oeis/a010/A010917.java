package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010917 Pisot sequence <code>E(5,21), a(n) = floor( a(n-1)^2/a(n-2) + 1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A010917 extends PisotSequence {

  /** Construct the sequence. */
  public A010917() {
    super(5, 21);
  }
}

