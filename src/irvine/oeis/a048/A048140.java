package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000219;
import irvine.oeis.a005.A005987;

/**
 * A048140 Number of planar partitions of n, but partitions that are mirror images of each other (when regarded as 3-D objects) are counted only once.
 * @author Sean A. Irvine
 */
public class A048140 extends A000219 {

  private final A005987 mS = new A005987();

  {
    super.next();
    mS.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().add(mS.next()).divide2();
  }
}

