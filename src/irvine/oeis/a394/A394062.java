package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a393.A393096;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394062 a(n) = A393096(n) - sopf(A393096(n)) where sopf(n) is the sum of distinct primes of n.
 * @author Sean A. Irvine
 */
public class A394062 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394062() {
    super(1, new A393096(), k -> k.subtract(Functions.SOPF.z(k)));
  }
}
