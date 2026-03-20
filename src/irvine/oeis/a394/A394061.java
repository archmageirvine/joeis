package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a393.A393096;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394061 Prime number produced by summing the distinct prime factors of the numbers in A393096.
 * @author Sean A. Irvine
 */
public class A394061 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394061() {
    super(1, new A393096(), Functions.SOPF::z);
  }
}
