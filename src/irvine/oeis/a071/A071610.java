package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071610 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071610() {
    super(new A071609(), Functions.CEIL_SQRT::z);
  }
}
