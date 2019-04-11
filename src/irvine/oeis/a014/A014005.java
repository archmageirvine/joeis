package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014005 Pisot sequence E(9,19), <code>a(n)=[ a(n-1)^2/a(n-2)+1/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A014005 extends PisotSequence {

  /** Construct the sequence. */
  public A014005() {
    super(9, 19);
  }
}

