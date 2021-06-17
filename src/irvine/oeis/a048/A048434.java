package irvine.oeis.a048;

import irvine.math.cr.CR;

/**
 * A048434 Smallest denominator of fraction using palindromes that approximates 'phi' to at least n digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A048434 extends A048430 {

  @Override
  protected CR getTarget() {
    return CR.PHI;
  }
}
