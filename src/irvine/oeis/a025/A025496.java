package irvine.oeis.a025;

import irvine.oeis.a020.A020908;

/**
 * A025496 Number of terms in Zeckendorf representation of 4^n.
 * @author Sean A. Irvine
 */
public class A025496 extends A020908 {

  @Override
  protected long base() {
    return 4;
  }
}
