package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a001.A001349;
import irvine.oeis.a007.A007146;

/**
 * A052446 Number of unlabeled simple connected bridged graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A052446 extends A001349 {

  private final A007146 mA = new A007146();

  {
    super.next(); // skip 0th
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
