package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014006 Pisot sequence E(10,18), <code>a(n)=[ a(n-1)^2/a(n-2)+1/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A014006 extends PisotSequence {

  /** Construct the sequence. */
  public A014006() {
    super(10, 18);
  }
}

