package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010924 Pisot sequence E(8,55), <code>a(n)=[ a(n-1)^2/a(n-2)+1/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A010924 extends PisotSequence {

  /** Construct the sequence. */
  public A010924() {
    super(8, 55);
  }
}

