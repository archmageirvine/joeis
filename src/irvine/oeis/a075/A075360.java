package irvine.oeis.a075;

import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054750;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075360 extends PrependSequence {

  /** Construct the sequence. */
  public A075360() {
    super(1, new A054750().skip(4), 11, 0, 23, 43);
  }
}
