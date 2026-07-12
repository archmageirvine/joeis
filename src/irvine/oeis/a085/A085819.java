package irvine.oeis.a085;

import irvine.oeis.PartialProductSequence;

/**
 * A085819 a(n) = Product_{k&lt;=n} A085818(k).
 * @author Sean A. Irvine
 */
public class A085819 extends PartialProductSequence {

  /** Construct the sequence. */
  public A085819() {
    super(1, new A085818());
  }
}
