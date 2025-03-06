package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.a013.A013929;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075732 Fibonacci numbers F(k) for k not squarefree (A013929).
 * @author Sean A. Irvine
 */
public class A075732 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075732() {
    super(1, new A013929(), Functions.FIBONACCI::z);
  }
}
