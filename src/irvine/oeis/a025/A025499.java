package irvine.oeis.a025;

import irvine.oeis.a020.A020908;

/**
 * A025499 Number of terms in Zeckendorf representation of <code>7^n</code>.
 * @author Sean A. Irvine
 */
public class A025499 extends A020908 {

  @Override
  protected long base() {
    return 7;
  }
}
