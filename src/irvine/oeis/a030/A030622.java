package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000455;

/**
 * A030622 Powers of 2 grouped in pairs of 2 digits (version <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A030622 extends A000455 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(10).add(super.next());
  }
}

