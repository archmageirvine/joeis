package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080970 A014486-indices of the trees whose interior zigzag-tree (Stanley's c) is not branch-reduced (in the sense defined by Donaghey).
 * @author Sean A. Irvine
 */
public class A080970 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080970() {
    super(0, new A080971(), Functions.GLOBAL_CATALAN_RANK::z);
  }
}

