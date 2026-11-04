package irvine.oeis.a087;

import irvine.math.z.Z;

/**
 * A087283 An infinite audioactive word, one of three in the cycle that results from the limit of the 'Look and Say' sequence using method A with an initial term of 1 (A005150).
 * @author Sean A. Irvine
 */
public class A087283 extends A087282 {

  @Override
  protected Z select(final int n, final String a, final String b, final String c) {
    return Z.valueOf(b.charAt(n) - '0');
  }
}

