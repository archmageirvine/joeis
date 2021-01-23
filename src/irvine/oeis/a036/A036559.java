package irvine.oeis.a036;

import irvine.oeis.ComplementSequence;

/**
 * A036559 Squared distances that cannot arise in any Barlow packing of spheres of diameter sqrt(3) (the scale being the simplest one that makes this an integer sequence).
 * @author Sean A. Irvine
 */
public class A036559 extends ComplementSequence {

  /** Construct the sequence. */
  public A036559() {
    super(new A036558());
  }
}
