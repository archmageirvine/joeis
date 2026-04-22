package irvine.oeis.a394;

import irvine.oeis.a298.A298856;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394934 allocated for Hartmut F. W. Hoft.
 * @author Sean A. Irvine
 */
public class A394934 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394934() {
    super(1, new A298856(), k -> k.subtract(1));
  }
}
