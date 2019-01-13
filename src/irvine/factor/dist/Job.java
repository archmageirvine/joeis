package irvine.factor.dist;

/**
 * Maintains all the information associated with a single number to be factored.
 *
 * @author Sean A. Irvine
 */
class Job {

  /** Name for the number, e.g. F1000 */
  private final String mName;
  /** B1 parameter for ECM run */
  private final long mBound;
  /** Total number of curves to run */
  private final int mTarget;
  /** The composite number represented as a string */
  private final String mComposite;
  /** The number of curves run so far */
  private int mCount;
  /** The current factoring status, false=running, true=finished */
  private boolean mStatus;
  /** The resulting factor output (if any) */
  private String mFactor = null;

  /**
   * Construct a new job for the specified number.
   *
   * @param name short name to associate with number
   * @param bound ECM B1 bound
   * @param target target number of curves
   * @param composite the number
   */
  Job(final String name, final long bound, final int target, final String composite) {

    if (bound <= 0 || target <= 0) {
      throw new RuntimeException("Bad numeric argument supplied.");
    }

    mName = name;
    mBound = bound;
    mTarget = target;
    mComposite = composite;
    mStatus = false;
    mCount = 0;
  }

  boolean getStatus() {
    return mStatus;
  }

  String getName() {
    return mName;
  }

  String getComposite() {
    return mComposite;
  }

  long getBound() {
    return mBound;
  }

  int getRemaining() {
    return mTarget - mCount;
  }

  String getRatio() {
    return mCount + "/" + mTarget;
  }

  void bumpCount() {
    if (++mCount >= mTarget) {
      mStatus = true;
    }
  }

  void setFinished() {
    mStatus = true;
  }

  void setFactor(final String s) {
    if (mFactor == null) {
      mFactor = s;
    }
  }

  String getFactor() {
    return mFactor;
  }

}
