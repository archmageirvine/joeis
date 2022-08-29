package irvine.oeis.a058;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005277;

/**
 * A058826 Even cototient numbers which are nontotients.
 * @author Sean A. Irvine
 */
public class A058826 extends IntersectionSequence {

  /** Construct the sequence. */
  public A058826() {
    super(new A005277(), new A058817());
  }
}
