package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075161 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075161() {
    super(0, new A075165(), Functions.GLOBAL_CATALAN_RANK::z);
  }
}
