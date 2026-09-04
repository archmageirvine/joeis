package irvine.oeis.a059;

import irvine.oeis.PartialProductSequence;

/**
 * A059382 a(n) = Product_{i=1..n} J_3(i).
 * @author Sean A. Irvine
 */
public class A059382 extends PartialProductSequence {

  /** Construct the sequence. */
  public A059382() {
    super(1, new A059376());
  }
}
