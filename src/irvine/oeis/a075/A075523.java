package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075523 First nonprime reached when starting with the n-th prime p and iterating the map k -&gt; 4*k+(p mod 4), or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A075523 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final long r = p.mod(4);
    Z m = p;
    while (m.isProbablePrime()) {
      m = m.shiftLeft(2).add(r);
    }
    return m;
  }
}

