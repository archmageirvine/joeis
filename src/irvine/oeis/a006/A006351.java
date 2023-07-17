package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000311;

/**
 * A006351 Number of series-parallel networks with n labeled edges. Also called yoke-chains by Cayley and MacMahon.
 * @author Sean A. Irvine
 */
public class A006351 extends A000311 {

  /** Construct the sequence. */
  public A006351() {
    super(1);
  }

  {
    super.next();
    super.next();
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}

