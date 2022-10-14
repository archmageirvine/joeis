package irvine.oeis.a059;

import irvine.oeis.a054.A054910;

/**
 * A059869 Numbers k such that there exist no palindromic heptagonals of length k.
 * @author Sean A. Irvine
 */
public class A059869 extends A059868 {

  /** Construct the sequence. */
  public A059869() {
    super(new A054910());
  }
}
