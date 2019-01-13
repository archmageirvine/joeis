package irvine.math.nauty;

/**
 * User defined automorphism procedure.
 * @author Sean A. Irvine
 */
public interface UserAutomProc {

  /**
   * User defined automorphism procedure
   * @param count graph
   * @param p permutation?
   * @param orbits orbits in graph
   * @param numorbits number of orbits
   * @param stabvertex stable vertex
   * @param n number of vertices
   */
  void automorphism(int count, int[] p, int[] orbits, int numorbits, int stabvertex, int n);
}
