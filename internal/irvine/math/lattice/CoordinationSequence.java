package irvine.math.lattice;

import java.util.TreeSet;

/**
 * Coordination sequence for a lattice.
 * @author Sean A. Irvine
 */
public final class CoordinationSequence {

  private CoordinationSequence() { }

  /**
   * Noddy for testing.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final Lattice l = Lattices.HYDROGEN_PEROXIDE;
    final TreeSet<Long> seen = new TreeSet<>();
    TreeSet<Long> current = new TreeSet<>();
    final long origin = l.origin();
    seen.add(origin);
    current.add(origin);
    while (true) {
      System.out.println(current.size());
      final TreeSet<Long> next = new TreeSet<>();
      for (final long pt : current) {
        for (final long n : l.neighbours(pt)) {
          if (seen.add(n)) {
            next.add(n);
          }
        }
      }
      current = next;
    }
  }
}
