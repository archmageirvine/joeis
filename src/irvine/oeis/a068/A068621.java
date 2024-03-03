package irvine.oeis.a068;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000217;

/**
 * A068590.
 * @author Sean A. Irvine
 */
public class A068621 extends A068618 {

  /** Construct the sequence. */
  public A068621() {
    super(new PrependSequence(new A000217(), 7));
  }
}
