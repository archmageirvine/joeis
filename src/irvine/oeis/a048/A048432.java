package irvine.oeis.a048;

import irvine.math.cr.CR;

/**
 * A048432 Smallest denominator of fraction using palindromes that approximates 'e' to at least n digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A048432 extends A048430 {

  @Override
  protected CR getTarget() {
    return CR.E;
  }
}
