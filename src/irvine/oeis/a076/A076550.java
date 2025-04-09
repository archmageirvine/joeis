package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.a075.A075088;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076550 Indices of triangular numbers listed in A075088.
 * @author Sean A. Irvine
 */
public class A076550 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076550() {
    super(1, new A075088(), Functions.TRINV::z);
  }
}
