package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010902 Pisot sequence E(14,23), a(n) = floor( a(n-1)^2/a(n-2)+1/2 ).
 * @author Sean A. Irvine
 */
public class A010902 extends PisotSequence {

  /** Construct the sequence. */
  public A010902() {
    super(14, 23);
  }
}

