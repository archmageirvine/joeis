package irvine.oeis.a339;

import irvine.oeis.a003.A003430;

/**
 * A339226 Number of oriented series-parallel networks with n elements of 2 colors.
 * @author Gregory Morse
 */
public class A339226 extends A003430 {
  /** Construct the sequence. */
  public A339226() {
    super(1, 2);
    super.next();
  }
}
