package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014007 Pisot sequence <code>E(10,21), a(n) = floor( a(n-1)^2/a(n-2)+1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A014007 extends PisotSequence {

  /** Construct the sequence. */
  public A014007() {
    super(10, 21);
  }
}

