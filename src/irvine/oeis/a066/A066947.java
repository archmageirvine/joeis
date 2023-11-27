package irvine.oeis.a066;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066947 Number of elements of order 2 in GL(2,Z_n).
 * @author Sean A. Irvine
 */
public class A066947 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066947() {
    super(2, new A066907().skip(), k -> k.subtract(1));
  }
}
