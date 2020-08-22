package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010913 Pisot sequence E(3,17), a(n) = floor( a(n-1)^2/a(n-2)+1/2 ).
 * @author Sean A. Irvine
 */
public class A010913 extends PisotSequence {

  /** Construct the sequence. */
  public A010913() {
    super(3, 17);
  }
}

