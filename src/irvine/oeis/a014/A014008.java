package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014008 Pisot sequence E(10,22), a(n) = floor( a(n-1)^2/a(n-2)+1/2 ).
 * @author Sean A. Irvine
 */
public class A014008 extends PisotSequence {

  /** Construct the sequence. */
  public A014008() {
    super(10, 22);
  }
}

