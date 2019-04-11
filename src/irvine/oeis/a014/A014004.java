package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014004 Pisot sequence E(9,17), <code>a(n) = floor( a(n-1)^2/a(n-2) + 1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A014004 extends PisotSequence {

  /** Construct the sequence. */
  public A014004() {
    super(9, 17);
  }
}

