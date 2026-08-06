package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086204 Decimal equivalents of strings in A086884.
 * @author Sean A. Irvine
 */
public class A086204 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086204() {
    super(2, new A086884(), k -> new Z(k.toString(), 2));
  }
}
