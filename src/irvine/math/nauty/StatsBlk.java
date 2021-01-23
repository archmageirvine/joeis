package irvine.math.nauty;

import irvine.math.z.Z;

/**
 * Statistics recording.
 * @author B. D. McKay
 * @author Sean A. Irvine
 */
public class StatsBlk {
  Z mGrpSize = Z.ONE;        /* size of group is */
  int mNumOrbits;          /* number of orbits in group */
  int mNumGenerators;      /* number of generators found */
  //int mErrStatus;          /* if non-zero : an error code */
  //#define outofspace mErrStatus;   /* for backwards compatibility */
  long mNumNodes;      /* total number of nodes */
  long mNumBadLeaves;  /* number of leaves of no use */
  int mMaxLevel;                /* maximum depth of search */
  long mTcTotal;       /* total size of all target cells */
  long mCanUpdates;    /* number of updates of best label */
  //long mInvApplics;    /* number of applications of invariant */
  //long mInvSuccesses;  /* number of successful uses of invariant() */
  //int mInvarSucLevel;      /* least level where invariant worked */

  /**
   * Return the group size.
   * @return group size
   */
  public Z groupSize() {
    return mGrpSize;
  }

  public int getNumOrbits() {
    return mNumOrbits;
  }
}
