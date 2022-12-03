package irvine.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read boards counting those which are symmetric.
 * @author Sean A. Irvine
 */
public final class Connect4CountSymmetric {

  private Connect4CountSymmetric() { }

  /**
   * Count symmetric boards from input file.
   * @param args ignored
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    long sym = 0;
    long total = 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String dense;
      while ((dense = r.readLine()) != null) {
        if (!dense.isEmpty()) {
          ++total;
          final Connect4Board board = new Connect4Board(dense);
          if (board.isSymmetric()) {
            ++sym;
          }
        }
      }
    }
    System.out.println(sym + " / " + total);
  }
}
