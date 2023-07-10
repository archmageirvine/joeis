package irvine.oeis.a064;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064422 Football league numbers: the possible point series for a league of n teams playing each other twice where for each match 3 points are awarded to the winning team and 1 to each in the case of a tie.
 * @author Sean A. Irvine
 */
public class A064422 extends Sequence1 {

  private int mN = 0;
  private final HashSet<List<Integer>> mScoreVectors = new HashSet<>();

  private void search(final int[] vec, final int teamA, final int teamB) {
    if (teamB >= teamA) {
      search(vec, teamA + 1, 0);
      return;
    }
    if (teamA >= vec.length) {
      final ArrayList<Integer> res = new ArrayList<>();
      for (final int s : vec) {
        res.add(s);
      }
      Collections.sort(res);
      mScoreVectors.add(res);
      return;
    }
    vec[teamB] += 6; // b wins both games
    search(vec, teamA, teamB + 1);
    vec[teamB] -= 3; // win one game each
    vec[teamA] += 3;
    search(vec, teamA, teamB + 1);
    vec[teamB] -= 3; // a wins both games
    vec[teamA] += 3;
    search(vec, teamA, teamB + 1);
    vec[teamB] += 2; // both games draws
    vec[teamA] -= 4;
    search(vec, teamA, teamB + 1);
    vec[teamB] += 2;  // b wins 1 game, other draw
    --vec[teamA];
    search(vec, teamA, teamB + 1);
    vec[teamB] -= 3; // a wins 1 game, other draw
    vec[teamA] += 3;
    search(vec, teamA, teamB + 1);
    vec[teamA] -= 4;
    --vec[teamB];
  }

  @Override
  public Z next() {
    ++mN;
    mScoreVectors.clear();
    search(new int[mN], 1, 0);
    return Z.valueOf(mScoreVectors.size());
  }
}
