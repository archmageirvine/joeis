package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.InverseSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076983 Smallest triangular number divisible by exactly n triangular numbers.
 * @author Sean A. Irvine
 */
public class A076983 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076983() {
    super(1, new InverseSequence(new A076982()), Functions.TRIANGULAR::z);
  }
}

