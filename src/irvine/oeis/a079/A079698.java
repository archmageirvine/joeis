package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.DistinctSequence;
import irvine.oeis.a005.A005277;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079698 extends DistinctSequence {

  /** Construct the sequence. */
  public A079698() {
    super(new SimpleTransformSequence(new A005277(), Functions.MAKE_ODD::z));
  }
}

