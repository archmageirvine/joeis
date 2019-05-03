package irvine.oeis.a006;

import chesspresso.position.Position;
import irvine.math.z.Z;
import irvine.oeis.a048.A048987;

/**
 * A006494 Number of possible chess games at the end of the n-th ply plus number of games that terminate <code>(i.e.</code>, mate) in fewer than n plies.
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

