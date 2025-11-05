package irvine.oeis.a081;

import irvine.oeis.a005.A005110;

/**
 * A081640 a(n) = n-th prime of class 12- according to the Erd\u0151s-Selfridge classification.
 * @author Sean A. Irvine
 */
public class A081640 extends A005110 {

  @Override
  protected int primeClass() {
    return 12;
  }
}
