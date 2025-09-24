package irvine.oeis.a080;

import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079945;

/**
 * A080591.
 * @author Sean A. Irvine
 */
public class A080596 extends PrependSequence {

  /** Construct the sequence. */
  public A080596() {
    super(0, new A079945().skip(2), 1);
  }
}
