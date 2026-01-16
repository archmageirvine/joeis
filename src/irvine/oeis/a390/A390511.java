package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.oeis.a391.A391807;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A391807.
 * @author Sean A. Irvine
 */
public class A390511 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A390511() {
    super(1, new A391807(), Functions.PRIME::z);
  }
}

