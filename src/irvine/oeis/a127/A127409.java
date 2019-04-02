package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127409 Negative value of coefficient of x^(n-4) in the characteristic polynomial of a certain n X n integer circulant matrix.
 * @author Sean A. Irvine
 */
public class A127409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127409() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {160, 1750, 10044, 40817, 132608, 367416, 903000, 2020458, 4191264});
  }
}
