package irvine.oeis.a078;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078270 a(n) = A078269(n)/11.
 * @author Sean A. Irvine
 */
public class A078270 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078270() {
    super(new A078269(), k -> k.divide(11));
  }
}

