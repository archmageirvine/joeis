package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.math.zi.Zi;

/**
 * A076341 Imaginary part of the function defined multiplicatively on the complex numbers by 2-&gt;(2,0) and p-&gt;((floor(p/4)+floor((p mod 4)/2))*4,2-(p mod 4)) for odd primes p.
 * @author Sean A. Irvine
 */
public class A076341 extends A076340 {

  @Override
  protected Z select(final Zi n) {
    return n.im();
  }
}
