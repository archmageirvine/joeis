package irvine.math.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read graphs in <code>graph6</code> format from standard input and
 * count how many of them are Hamiltonian.
 * @author Sean A. Irvine
 */
public final class CountHamiltonian {

  private CountHamiltonian() { }

  /**
   * Count Hamiltonian graphs.
   * @param args ignored
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    long hamiltonian = 0;
    long total = 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        ++total;
        final Graph g = Graph6.toGraph(line);
        if (g.isHamiltonian()) {
          ++hamiltonian;
        }
      }
    }
    System.out.println(hamiltonian + " " + total);
  }

}
