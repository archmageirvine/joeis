package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A035331 Base-1000 expansion of Pi.
 * @author Sean A. Irvine
 */
public class A035331 extends A000796 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    }
    return super.next().multiply(10).add(super.next()).multiply(10).add(super.next());
  }
}

