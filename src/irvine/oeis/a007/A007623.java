package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A007623 Integers written in factorial base.
 * @author Sean A. Irvine
 */
public class A007623 extends LambdaSequence {

  /** Construct the sequence. */
  public A007623() {
    super(0, k -> Functions.FACTORIAL_BASE.z(Z.valueOf(k)));
  }
}

