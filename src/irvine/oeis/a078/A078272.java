package irvine.oeis.a078;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078272 a(n) = A078271(n)/11.
 * @author Sean A. Irvine
 */
public class A078272 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078272() {
    super(new A078271(), k -> k.divide(11));
  }
}

