package irvine.oeis.a071;

import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007908;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071269 extends FilterSequence {

  /** Construct the sequence. */
  public A071269() {
    super(1, new A007908(), DIVISIBLE_BY_INDEX);
  }
}
