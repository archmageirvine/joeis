package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.a005.A005117;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075731 Fibonacci numbers F(k) for k squarefree (A005117).
 * @author Sean A. Irvine
 */
public class A075731 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075731() {
    super(1, new A005117(), Functions.FIBONACCI::z);
  }
}
