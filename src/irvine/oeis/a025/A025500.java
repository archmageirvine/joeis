package irvine.oeis.a025;

import irvine.oeis.a020.A020908;

/**
 * A025500 Number of terms in Zeckendorf representation of <code>8^n</code>.
 * @author Sean A. Irvine
 */
public class A025500 extends A020908 {

  @Override
  protected long base() {
    return 8;
  }
}
