package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076972 a(n) = index of the triangular number A076971(n).
 * @author Sean A. Irvine
 */
public class A076972 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076972() {
    super(1, new A076971(), Functions.TRINV::z);
  }
}

