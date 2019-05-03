package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000900 Number of solutions to the rook problem on an <code>n X n</code> board having a certain symmetry group (see Robinson for details).
 * @author Sean A. Irvine
 */
public class A000900 extends A000085 {

  private final Sequence mA898 = new A000898();
  private Z mT = null;

  @Override
  public Z next() {
    final Z t;
    if (mT == null) {
      mT = mA898.next();
      t = mT;
    } else {
      t = mT;
      mT = null;
    }
    return super.next().subtract(t).divide(2);
  }
}

