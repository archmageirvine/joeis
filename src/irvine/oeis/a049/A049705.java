package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A049705 a(n)=3-k(n), where k=A000002=Kolakoski sequence; also the sequence of runlengths of a is k.
 * @author Sean A. Irvine
 */
public class A049705 extends A000002 {

  @Override
  public Z next() {
    return Z.THREE.subtract(super.next());
  }
}
