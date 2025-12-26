package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.oeis.a111.A111035;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A390356 a(n) = A000045(A111035(n)).
 * @author Sean A. Irvine
 */
public class A390356 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A390356() {
    super(new A111035(), Functions.FIBONACCI::z);
  }
}

