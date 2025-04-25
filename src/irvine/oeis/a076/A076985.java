package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.InverseSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076985 Smallest Fibonacci numbers having exactly n Fibonacci divisors.
 * @author Sean A. Irvine
 */
public class A076985 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076985() {
    super(1, new InverseSequence(new A076984()), Functions.FIBONACCI::z);
  }
}

