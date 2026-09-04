package irvine.oeis.a059;

import irvine.oeis.PartialProductSequence;

/**
 * A059383 a(n) = Product_{i=1..n} J_4(i).
 * @author Sean A. Irvine
 */
public class A059383 extends PartialProductSequence {

  /** Construct the sequence. */
  public A059383() {
    super(1, new A059377());
  }
}
