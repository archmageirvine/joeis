package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a037.A037223;
import irvine.oeis.a122.A122670;

/**
 * A000903 Number of inequivalent ways of placing n nonattacking rooks on n X n board up to rotations and reflections of the board.
 * @author Sean A. Irvine
 */
public class A000903 extends A037223 {

  private final Sequence mA85 = new A000085();
  private final Sequence mA122670 = new A122670();
  private final Sequence mA142 = new A000142();

  {
    mA85.next();
    mA142.next();
    mA122670.next();
    super.next();
  }

  @Override
  public Z next() {
    return Z.ONE.max(super.next()
                     .add(mA142.next())
                     .add(mA122670.next().multiply2())
                     .add(mA85.next().multiply2())
                     .divide(8));
  }
}

