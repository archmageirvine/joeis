package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a000.A000295;

/**
 * A016031 De Bruijn's sequence: 2^(2^(n-1) - n): ways of arranging 2^n bits in circle so all 2^n consecutive strings of length n are distinct.
 * @author Sean A. Irvine
 */
public class A016031 extends A000295 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
