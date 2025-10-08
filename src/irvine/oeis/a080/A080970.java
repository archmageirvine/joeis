package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080970 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080970() {
    super(0, new A080971(), Functions.GLOBAL_CATALAN_RANK::z);
  }
}

