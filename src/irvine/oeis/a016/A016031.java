package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a000.A000295;

/**
 * A016031 De Bruijn's sequence: <code>2^(2^(n-1) - n)</code>: number of ways of arranging <code>2^n</code> bits in circle so all <code>2^n</code> consecutive strings of length n are distinct.
 * @author Sean A. Irvine
 */
public class A016031 extends A000295 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
