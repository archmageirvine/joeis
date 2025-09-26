package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A387142 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A387142 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    int e = 1;
    while (!p.pow(++e).toString().contains(s)) {
      // do nothing
    }
    return Z.valueOf(e);
  }
}
