package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048430 Smallest denominator of fraction using palindromes that approximates 'Pi' to at least n digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A048430 extends A048429 {

  @Override
  protected Z select(final Z num, final Z den) {
    return den;
  }
}
