package irvine.oeis.a025;

import irvine.oeis.a020.A020908;

/**
 * A025498 Number of terms in Zeckendorf representation of <code>6^n</code>.
 * @author Sean A. Irvine
 */
public class A025498 extends A020908 {

  @Override
  protected long base() {
    return 6;
  }
}
