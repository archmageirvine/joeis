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
    final ArrayList<Integer> players = new ArrayList<>();
    for (int k = 0; k < mN; ++k) {
      players.add(1);
    }
    int donationPos = -1;
    int playerPos = -1;
    int droppedPlayers = 0;
    int zeroCounts = 0;
    while (true) {
      if (++donationPos == DONATIONS.length) {
        donationPos = 0;
      }
      if (++playerPos == players.size()) {
        if (droppedPlayers == 0 && ++zeroCounts > HEURISTIC) {
          // Solution appears to be stable
          return Z.valueOf(players.size());
        }
        droppedPlayers = 0;
        playerPos = 0;
      }
      //System.out.println(players + " pos=" + playerPos);
      final int nextPlayer = (playerPos + 1) % players.size();
      final int donation = Math.min(players.get(playerPos), DONATIONS[donationPos]);
      players.set(nextPlayer, donation + players.get(nextPlayer));
      if (donation == players.get(playerPos)) {
        // player is eliminated
        players.remove(playerPos);
        ++droppedPlayers;
        // Note playerPos effectively increased by this deletion, so compensate
        --playerPos;
      } else {
        players.set(playerPos, players.get(playerPos) - donation);
      }
    }
  }
}
