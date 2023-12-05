package irvine.oeis.a067;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067075 a(n) is the smallest number m such that the sum of the digits of m^3 is equal to n^3.
 * @author Sean A. Irvine
 */
public class A067075 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067075() {
    super(0, new A067074(), k -> k.root(3));
  }
}
