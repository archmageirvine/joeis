package irvine.oeis.a071;

import irvine.oeis.Combiner;

/**
 * A071825.
 * @author Sean A. Irvine
 */
public class A071825 extends Combiner {

  /** Construct the sequence. */
  public A071825() {
    super(1, new A071823(), new A071824(), SUBTRACT);
  }
}
