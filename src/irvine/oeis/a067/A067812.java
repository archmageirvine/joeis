package irvine.oeis.a067;

import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A067812 Nonprime n such that 2n+1 is prime.
 * @author Sean A. Irvine
 */
public class A067812 extends FilterSequence {

  /** Construct the sequence. */
  public A067812() {
    super(1, new A018252(), k -> k.multiply2().add(1).isProbablePrime());
  }
}
