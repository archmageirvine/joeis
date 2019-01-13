package irvine.oeis.a005;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a129.A129427;

/**
 * A005967.
 * @author Sean A. Irvine
 */
public class A005967 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A005967() {
    super(new A129427(), 1);
    next();
  }
}
