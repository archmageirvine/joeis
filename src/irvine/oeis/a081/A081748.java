package irvine.oeis.a081;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A081748 (A081746(n) - n)/4.
 * @author Sean A. Irvine
 */
public class A081748 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A081748() {
    super(new A081747(), k -> k.divide(4));
  }
}
