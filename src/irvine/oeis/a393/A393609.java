package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.a035.A035513;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A393609 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393609 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A393609() {
    super(1, new A035513(), Functions.PRIME::z);
  }
}

