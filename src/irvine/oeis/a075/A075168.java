package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075168 Position of A075170(n) in A014486.
 * @author Sean A. Irvine
 */
public class A075168 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075168() {
    super(0, new A075170(), Functions.GLOBAL_CATALAN_RANK::z);
  }
}
