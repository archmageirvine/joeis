package irvine.oeis.a029;

import irvine.oeis.a001.A001285;
import irvine.oeis.transform.EulerTransform;

/**
 * A029877 Euler transform of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029877 extends EulerTransform {

  /** Construct the sequence. */
  public A029877() {
    super(new A001285(), 0);
    next();
  }
}
