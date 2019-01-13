package irvine.math.nauty;

import java.util.ArrayList;
import java.util.List;

/**
 * Group record.
 * @author Sean A. Irvine
 */
final class GroupRecord {
  int mN;                   /* number of points */
  //int mNumOrbits;           /* number of orbits */
  int mDepth;               /* number of points in base */
  final List<LevelRecord> mLevelInfo;

  GroupRecord(final int depth) {
    mLevelInfo = new ArrayList<>(depth);
    for (int k = 0; k < depth; ++k) {
      mLevelInfo.add(new LevelRecord());
    }
  }
}
