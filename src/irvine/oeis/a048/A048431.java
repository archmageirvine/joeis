package irvine.oeis.a048;

import irvine.math.cr.CR;

/**
 * A048431 Smallest numerator of fraction using palindromes that approximates 'e' to at least n digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A048431 extends A048429 {

  @Override
  protected CR getTarget() {
    return CR.E;
  }
}
