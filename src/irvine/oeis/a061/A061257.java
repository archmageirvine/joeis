package irvine.oeis.a061;

import irvine.oeis.a002.A002322;
import irvine.oeis.transform.EulerTransform;

/**
 * A061257 Euler transform of reduced totient function psi(n), cf. A002322.
 * @author Sean A. Irvine
 */
public class A061257 extends EulerTransform {

  /** Construct the sequence. */
  public A061257() {
    super(0, new A002322(), 1);
  }
}
