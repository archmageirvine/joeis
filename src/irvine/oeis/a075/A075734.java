package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.a030.A030229;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075734 Fibonacci numbers F(k) when k is a product of an even number of distinct primes A030229 (mu(k)=1).
 * @author Sean A. Irvine
 */
public class A075734 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075734() {
    super(1, new A030229(), Functions.FIBONACCI::z);
  }
}
