package irvine.oeis.a061;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000010;

/**
 * A061255 Euler transform of Euler totient function <code>phi(n)</code>, cf. <code>A000010</code>.
 * @author Sean A. Irvine
 */
public class A061255 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A061255() {
    super(new A000010(), 0);
  }
}
