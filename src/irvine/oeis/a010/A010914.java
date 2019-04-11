package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010914 Pisot sequence E(5,17), <code>a(n) = floor(a(n-1)^2 / a(n-2) + 1/2)</code>.
 * @author Sean A. Irvine
 */
public class A010914 extends PisotSequence {

  /** Construct the sequence. */
  public A010914() {
    super(5, 17);
  }
}

