package irvine.oeis.a059;

import irvine.oeis.PartialProductSequence;

/**
 * A059382 Product J_3(i), i=1..n.
 * @author Sean A. Irvine
 */
public class A059382 extends PartialProductSequence {

  /** Construct the sequence. */
  public A059382() {
    super(new A059376());
  }
}
