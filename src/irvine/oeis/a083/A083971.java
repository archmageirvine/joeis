package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083971 Reverse of k concatenated with k, divided by k, where k = A083970(n).
 * @author Sean A. Irvine
 */
public class A083971 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083971() {
    super(1, new A083970(), k -> new Z(Functions.REVERSE.z(k).toString() + k).divide(k));
  }
}
