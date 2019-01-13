package irvine.math.nauty;

/**
 * Form orbits on power set of VG.
 * @author Sean A. Irvine
 */
class GenGraphsAutomProc implements UserAutomProc {
  private final LevelData[] mLevelData;

  GenGraphsAutomProc(final LevelData[] levelData) {
    mLevelData = levelData;
  }

  @Override
  public void automorphism(final int count, final int[] p, final int[] orbits, final int numorbits, final int stabvertex, final int n) {
    final int[] xorb = mLevelData[n].mXOrb;
    final int[] xset = mLevelData[n].mXSet;
    final int[] xinv = mLevelData[n].mXInv;
    final int lo = mLevelData[n].mLo;
    final int hi = mLevelData[n].mHi;

    if (count == 1) {                        /* first automorphism */
      for (int i = lo; i < hi; ++i) {
        xorb[i] = i;
      }
    }

    int moved = 0;
    for (int i = 0; i < n; ++i) {
      if (p[i] != i) {
        moved |= GenerateGraphs.XBIT[i];
      }
    }

    for (int i = lo; i < hi; ++i) {
      int w = xset[i] & moved;
      if (w == 0) {
        continue;
      }
      int pxi = xset[i] & ~moved;
      while (w != 0) {
        final int j1 = GenerateGraphs.xNextBit(w);
        w ^= GenerateGraphs.XBIT[j1];
        pxi |= GenerateGraphs.XBIT[p[j1]];
      }
      final int pi = xinv[pxi];

      int j1 = xorb[i];
      while (xorb[j1] != j1) {
        j1 = xorb[j1];
      }
      int j2 = xorb[pi];
      while (xorb[j2] != j2) {
        j2 = xorb[j2];
      }
      if (j1 < j2) {
        xorb[j2] = xorb[i] = xorb[pi] = j1;
      } else if (j1 > j2) {
        xorb[j1] = xorb[i] = xorb[pi] = j2;
      }
    }
  }
}
