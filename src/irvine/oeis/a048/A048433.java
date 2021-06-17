package irvine.oeis.a048;

import irvine.math.cr.CR;

/**
 * A048433 Smallest numerator of fraction using palindromes that approximates 'phi' to at least n digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A048433 extends A048429 {

  @Override
  protected CR getTarget() {
    return CR.PHI;
  }
}
