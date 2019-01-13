package irvine.math.plantri;

/**
 * Interface for reduction testing.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public interface LegalReduction {

  /**
   * Test if an edge is a legal reduction.
   * @param e edge to test
   * @return true if reducible
   */
  boolean legalReduction(Edge e);
}
