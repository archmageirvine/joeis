package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a037.A037223;

/**
 * A000899 Number of solutions to the rook problem on an n X n board having a certain symmetry group (see Robinson for details).
 * @author Sean A. Irvine
 */
public class A000899 extends A000142 {

  private final Sequence mA85 = new A000085();
  private final Sequence mA37223 = new A037223();
  private final Sequence mA898 = new A000898();
  private Z mT = mA898.next();

  {
    super.next();
    mA85.next();
    mA37223.next();
  }

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
    return super.next()
      .subtract(mA85.next().multiply2())
      .subtract(mA37223.next())
      .add(t.multiply2())
      .divide(8);
  }
}

