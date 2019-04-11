package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010908 Pisot sequence E(4,21), <code>a(n) = floor(a(n-1)^2/a(n-2) + 1/2)</code>.
 * @author Sean A. Irvine
 */
public class A010908 extends PisotSequence {

  /** Construct the sequence. */
  public A010908() {
    super(4, 21);
  }
}

