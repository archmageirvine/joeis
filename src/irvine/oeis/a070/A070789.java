package irvine.oeis.a070;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070789 Integers n such that the 'Reverse and Add!' trajectory of n joins the trajectory of 1.
 * @author Sean A. Irvine
 */
public class A070789 extends Sequence1 {

  private static final int HEURISTIC = 1000;
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mTargetTrajectory;
  private long mN;

  protected A070789(final long trajectoryStart) {
    mN = trajectoryStart;
    mTargetTrajectory = Z.valueOf(trajectoryStart);
  }

  /** Construct the sequence. */
  public A070789() {
    this(1);
  }

  private boolean is(Z t) {
    for (int k = 0; k < HEURISTIC; ++k) {
      while (t.compareTo(mTargetTrajectory) >= 0) {
        mTargetTrajectory = Functions.REVERSE_AND_ADD.z(mTargetTrajectory);
        mSeen.add(mTargetTrajectory);
      }
      if (mSeen.contains(t)) {
        return true;
      }
      t = Functions.REVERSE_AND_ADD.z(t);
    }
    return false;
  }

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(mTargetTrajectory);
      return mTargetTrajectory;
    }
    while (true) {
      final Z t = Z.valueOf(++mN);
      if (is(t)) {
        return t;
      }
    }
  }
}
