package irvine.math.nauty;

/**
 * Form orbits on power set of VG.
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class GenGraphsAutomProcB implements UserAutomProc {
  private final LevelData[] mLevelData;

  GenGraphsAutomProcB(final LevelData[] levelData) {
    mLevelData = levelData;
  }

  @Override
  public void automorphism(final int count, final int[] p, final int[] orbits, final int numorbits, final int stabvertex, final int n) {
    final int[] xorb = mLevelData[n].mXOrb;
    final int[] xx = mLevelData[n].mXX;
    int xlim = mLevelData[n].mXLim;

    if (count == 1) {                        // first automorphism
      int j1 = 0;
      final int xlb = mLevelData[n].mXlb;

      for (int i = 0; i < xlim; ++i) {
        final int x = xx[i];
        if (Integer.bitCount(x) >= xlb) {
          xx[j1] = x;
          xorb[j1] = j1;
          ++j1;
        }
      }
      mLevelData[n].mXLim = xlim = j1;
    }

    int moved = 0;
    for (int i = 0; i < n; ++i) {
      if (p[i] != i) {
        moved |= GenerateGraphs.XBIT[i];
      }
    }
    int pxi;
    for (int i = 0; i < xlim; ++i) {
      int w = xx[i] & moved;
      if (w == 0) {
        continue;
      }
      pxi = xx[i] & ~moved;
      while (w != 0) {
        final int j1 = GenerateGraphs.xNextBit(w);
        w ^= GenerateGraphs.XBIT[j1];
        pxi |= GenerateGraphs.XBIT[p[j1]];
      }
      // pi = position of pxi

      int lo = 0;
      int hi = xlim - 1;

      int pi;
      while (true) {
        pi = (lo + hi) >>> 1;
        if (xx[pi] == pxi) {
          break;
        } else if (xx[pi] < pxi) {
          lo = pi + 1;
        } else {
          hi = pi - 1;
        }
      }

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
