package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080119 Positions of A080118 in A014486.
 * @author Sean A. Irvine
 */
public class A080119 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080119() {
    super(1, new A080118(), Functions.GLOBAL_CATALAN_RANK::z);
  }

}

