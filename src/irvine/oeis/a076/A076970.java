package irvine.oeis.a076;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076970 a(n) = A076969(n)^(1/3).
 * @author Sean A. Irvine
 */
public class A076970 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076970() {
    super(1, new A076969(), k -> k.root(3));
  }
}

