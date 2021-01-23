package irvine.oeis.a025;

import irvine.oeis.a020.A020908;

/**
 * A025501 Number of terms in Zeckendorf representation of 9^n.
 * @author Sean A. Irvine
 */
public class A025501 extends A020908 {

  @Override
  protected long base() {
    return 9;
  }
}
