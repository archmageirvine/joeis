package irvine.oeis.a029;

import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.a001.A001285;

/**
 * A029878 Inverse Euler transform of {A001285(0), A001285(1), ...} where A001285(n) is Thue-Morse sequence,.
 * @author Sean A. Irvine
 */
public class A029878 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A029878() {
    super(new A001285(), 0);
    next();
  }
}
