package irvine.oeis.a068;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068092.
 * @author Sean A. Irvine
 */
public class A068093 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068093() {
    super(1, new A068092(), k -> k.multiply(k.add(1)).divide2());
  }
}

