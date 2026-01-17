package irvine.oeis.a390;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a006.A006036;
import irvine.oeis.a347.A347202;

/**
 * A390873 Primitive semiperfect numbers (A006036) that are not the product of an odd prime number and a power of 2.
 * @author Sean A. Irvine
 */
public class A390873 extends IntersectionSequence {

  /** Construct the sequence. */
  public A390873() {
    super(new A347202(), new A006036());
  }
}

