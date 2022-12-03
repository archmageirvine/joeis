package irvine.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Step symmetric Connect4 boards.  Assumes sorted unique list for input.
 * @author Sean A. Irvine
 */
public final class Connect4Symmetric {

  private Connect4Symmetric() { }

  private static final int CHUNK = 100000000;

  /**
   * Using a dense representation of Connect 4 boards, step all the input
   * board by one move outputting the next move.
   * @param args mover (either 1 or 2)
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    if (args == null || args.length != 1) {
      System.err.println("Usage: Connect4Symmetric [1|2]");
      return;
    }
    final int mover = Integer.parseInt(args[0]);
    if (mover < 1 || mover > 2) {
      throw new IllegalArgumentException("Invalid mover");
    }
    final HashSet<String> store = new HashSet<>(CHUNK);
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String dense;
      while ((dense = r.readLine()) != null) {
        if (!dense.isEmpty()) {
          final Connect4Board board = new Connect4Board(dense);
          board.stepSymA(store, mover);
          if (store.size() > 100000000) {
            dumpBoard(store);
          }
        }
      }
      dumpBoard(store);
    }
  }

  private static void dumpBoard(final HashSet<String> store) {
    for (final String s : store) {
      System.out.println(s);
    }
    store.clear();
  }
}
