package irvine.oeis.a061;

import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005728;

/**
 * A061559.
 * @author Sean A. Irvine
 */
public class A061560 extends FilterSequence {

  /** Construct the sequence. */
  public A061560() {
    super(new A005728(), NONPRIME);
  }
}
