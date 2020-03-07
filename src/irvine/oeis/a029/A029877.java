package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a001.A001285;

/**
 * A029877 Euler transform of Thue-Morse sequence <code>A001285</code>.
 * @author Sean A. Irvine
 */
public class A029877 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029877() {
    super(new A001285(), 0);
    next();
  }
}
