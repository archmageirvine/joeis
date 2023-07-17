package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a013.A013971;

/**
 * A029831 Eisenstein series E_24(q) (alternate convention E_12(q)), multiplied by 236364091.
 * @author Sean A. Irvine
 */
public class A029831 extends A013971 {

  /** Construct the sequence. */
  public A029831() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(236364091);
    }
    return super.next().multiply(131040);
  }
}
