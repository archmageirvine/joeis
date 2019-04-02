package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014003 Pisot sequence E(9,15), a(n) = floor( a(n-1)^2/a(n-2) + 1/2 ).
 * @author Sean A. Irvine
 */
public class A014003 extends PisotSequence {

  /** Construct the sequence. */
  public A014003() {
    super(9, 15);
  }
}

