package irvine.math.nauty;

/**
 * Structure to hold level data.
 * @author Sean A. Irvine
 */
class LevelData {
  int mNe;
  int mDmax;          /* values used for mXlb, mXub calculation */
  int mXlb;
  int mXub;          /* saved bounds on extension degree */
  int mLo;
  int mHi;          /* work purposes for orbit calculation */
  final int[] mXStart = new int[GenerateGraphs.MAXN + 1]; /* index into mXSet[] for each cardinality */
  // below here mutable
  int[] mXSet;          /* array of all x-sets in card order */
  int[] mXCard;         /* cardinalities of all x-sets */
  int[] mXInv;          /* map from x-set to index in mXSet */
  int[] mXOrb;          /* min orbit representative */
  int[] mXX;            /* (-b, -t, -s, -m) candidate x-sets */
  /*   note: can be the same as mXCard */
  int mXLim;           /* number of x-sets in mXX[] */

  void prepareLevelData(final boolean restricted, final int n, final int nxsets, final int maxDeg) {
    final int tttn = 1 << n;
    mNe = -1;
    mDmax = -1;
    mXlb = -1;
    mXub = -1;

    if (restricted) {
      mXOrb = new int[nxsets];
      mXX = new int[nxsets];
      return;
    }

    mXSet = new int[nxsets];
    mXCard = new int[nxsets];
    mXInv = new int[tttn];
    mXOrb = new int[nxsets];
    mXX = mXCard;

    int j = 0;
    for (int i = 0; ; ++i) {
      final int h = Integer.bitCount(i);
      if (h <= maxDeg) {
        mXSet[j] = i;
        mXCard[j] = h;
        ++j;
      }
      if (i == (int) ((1L << n) - 1)) {
        break;
      }
    }

    if (j != nxsets) {
      throw new RuntimeException(">E geng: j=" + j + " mxsets=" + nxsets);
    }

    int h = 1;
    do {
      h = 3 * h + 1;
    } while (h < nxsets);

    do {
      for (int i = h; i < nxsets; ++i) {
        final int xw = mXSet[i];
        final int cw = mXCard[i];
        for (j = i; mXCard[j - h] > cw || (mXCard[j - h] == cw && mXSet[j - h] > xw); ) {
          mXSet[j] = mXSet[j - h];
          mXCard[j] = mXCard[j - h];
          if ((j -= h) < h) {
            break;
          }
        }
        mXSet[j] = xw;
        mXCard[j] = cw;
      }
      h /= 3;
    } while (h > 0);

    for (int i = 0; i < nxsets; ++i) {
      mXInv[mXSet[i]] = i;
    }

    mXStart[0] = 0;
    for (int i = 1; i < nxsets; ++i) {
      if (mXCard[i] > mXCard[i - 1]) {
        mXStart[mXCard[i]] = i;
      }
    }
    mXStart[mXCard[nxsets - 1] + 1] = nxsets;
  }
}
