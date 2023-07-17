package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a005.A005811;

/**
 * A033264 Number of blocks of {1,0} in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A033264 extends A005811 {

  /** Construct the sequence. */
  public A033264() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    final Z a = super.next();
    return a.subtract(a.add(1).divide2());
  }
}

