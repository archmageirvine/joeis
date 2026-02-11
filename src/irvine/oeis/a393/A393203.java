package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A393203 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393203 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A393203() {
    super(2, new A393202().skip(), Z::divide2);
  }
}

