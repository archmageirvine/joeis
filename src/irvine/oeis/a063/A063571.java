package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.a062.A062525;

/**
 * A063571 Smallest power of 8 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063571 extends PrependSequence {

  /** Construct the sequence. */
  public A063571() {
    super(new A062525().skip(2), 4, 3);
  }
}
