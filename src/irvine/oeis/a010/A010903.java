package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010903 Pisot sequence E(3,13): <code>a(n) = floor(a(n-1)^2/a(n-2) + 1/2)</code>.
 * @author Sean A. Irvine
 */
public class A010903 extends PisotSequence {

  /** Construct the sequence. */
  public A010903() {
    super(3, 13);
  }
}

