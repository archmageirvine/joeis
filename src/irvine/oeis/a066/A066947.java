package irvine.oeis.a066;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066937.
 * @author Sean A. Irvine
 */
public class A066947 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066947() {
    super(2, new A066907().skip(), k -> k.subtract(1));
  }
}
