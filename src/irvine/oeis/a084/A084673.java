package irvine.oeis.a084;

import irvine.oeis.PrependSequence;
import irvine.oeis.a037.A037055;

/**
 * A084673 Smallest prime in which a digit appears n times.
 * @author Sean A. Irvine
 */
public class A084673 extends PrependSequence {

  /** Construct the sequence. */
  public A084673() {
    super(1, new A037055().skip(2), 2);
  }
}
