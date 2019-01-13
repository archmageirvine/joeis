package irvine.oeis.a006;

import chesspresso.position.Position;
import irvine.math.z.Z;
import irvine.oeis.a048.A048987;

/**
 * A006494.
 * @author Sean A. Irvine
 */
public class A006494 extends A048987 {

  private long mMates;

  @Override
  protected boolean accept(final Position position) {
    if (position.isMate()) {
      ++mMates;
      return false; // so we don't double count this position
    }
    return true;
  }

  @Override
  public Z next() {
    return super.next().add(mMates);
  }
}

