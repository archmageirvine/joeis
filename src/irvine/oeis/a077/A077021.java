package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a002.A002249;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077021 a(n) is the unique odd positive solution y of 2^n = 7x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A077021 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077021() {
    super(3, new A002249().skip(), Z::abs);
  }
}
