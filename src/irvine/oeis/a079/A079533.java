package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002808;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079533 Floor(k - sqrt(k)) - phi(k) as k runs through the composite numbers (A002808).
 * @author Sean A. Irvine
 */
public class A079533 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079533() {
    super(1, new A002808(), k -> k.subtract(Functions.CEIL_SQRT.z(k)).subtract(Functions.PHI.z(k)));
  }
}
