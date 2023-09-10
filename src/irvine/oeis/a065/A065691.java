package irvine.oeis.a065;

import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061359;

/**
 * A065658.
 * @author Sean A. Irvine
 */
public class A065691 extends PrependSequence {

  /** Construct the sequence. */
  public A065691() {
    super(1, new A061359().skip(), 0, 10);
  }
}
