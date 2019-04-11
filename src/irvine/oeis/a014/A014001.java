package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014001 Pisot sequence E(7,15), <code>a(n)=[ a(n-1)^2/a(n-2)+1/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A014001 extends PisotSequence {

  /** Construct the sequence. */
  public A014001() {
    super(7, 15);
  }
}

