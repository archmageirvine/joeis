package irvine.oeis.a060;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060447 Cyclic token-passing numbers with pattern 121: players 1, 2, ..., n are seated around a table. Each has a penny. Player 1 passes a penny to player 2, who passes two pennies to player 3, who passes a penny to player 4. Player 4 passes a penny to player 5, who passes two pennies to player 6, who passes a penny to player 7 and so on, players passing 1,2,1,1,2,1,... pennies to the next player who still has some pennies. A player who runs out of pennies drops out of the game and leaves the table. Sequence gives number of players remaining when game reaches periodic state.
 * @author Sean A. Irvine
 */
public class A060447 extends Sequence1 {

  private static final int HEURISTIC = 100;
  private static final int[] DONATIONS = {1, 2, 1};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Integer> state = new ArrayList<>();
    for (int k = 0; k < mN; ++k) {
      state.add(1);
    }
    int donationPos = -1;
    int statePos = -1;
    int droppedPlayers = 0;
    int zeroCounts = 0;
    while (true) {
      if (++donationPos == DONATIONS.length) {
        donationPos = 0;
      }
      if (++statePos == state.size()) {
        if (droppedPlayers == 0 && ++zeroCounts > HEURISTIC) {
          // Solution appears to be stable
          return Z.valueOf(state.size());
        }
        droppedPlayers = 0;
        statePos = 0;
      }
      final int nextPlayer = (statePos + 1) % state.size();
      final int donation = Math.min(state.get(statePos), DONATIONS[donationPos]);
      state.set(nextPlayer, donation + state.get(nextPlayer));
      if (donation == state.get(statePos)) {
        // player is eliminated
        state.remove(statePos);
        ++droppedPlayers;
        // Note statePos effectively increased by this deletion, so compensate
        --statePos;
      } else {
        state.set(statePos, state.get(statePos) - donation);
      }
    }
  }
}
