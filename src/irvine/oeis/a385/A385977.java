package irvine.oeis.a385;

import irvine.oeis.a002.A002315;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078722.
 * @author Sean A. Irvine
 */
public class A385977 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A385977() {
    super(1, new A002315(), k -> k.add(1).multiply(k).multiply2());
  }
}
