package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010911 Pisot sequence E(3,11), a(n) = floor(a(n-1)^2/a(n-2) + 1/2).
 * @author Sean A. Irvine
 */
public class A010911 extends PisotSequence {

  /** Construct the sequence. */
  public A010911() {
    super(3, 11);
  }
}

