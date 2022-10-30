package irvine.oeis.a059;

import irvine.oeis.PartialProductSequence;

/**
 * A059383 Product J_4(i), i=1..n.
 * @author Sean A. Irvine
 */
public class A059383 extends PartialProductSequence {

  /** Construct the sequence. */
  public A059383() {
    super(1, new A059377());
  }
}
