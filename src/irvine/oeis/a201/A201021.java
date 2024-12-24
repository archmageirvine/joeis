package irvine.oeis.a201;

import irvine.oeis.FilterSequence;
import irvine.oeis.a034.A034054;

/**
 * A201021 Composite numbers whose multiplicative digital root is 7.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A201021 extends FilterSequence {

  /** Construct the sequence. */
  public A201021() {
    super(1, new A034054(), c -> !c.isProbablePrime());
  }
}
