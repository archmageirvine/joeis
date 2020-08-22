package irvine.oeis.a025;

import irvine.oeis.a020.A020908;

/**
 * A025502 Number of terms in Zeckendorf representation of 10^n.
 * @author Sean A. Irvine
 */
public class A025502 extends A020908 {

  @Override
  protected long base() {
    return 10;
  }
}
