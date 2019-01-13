package irvine.math.nauty;

/**
 * Definition of a function called for each level.
 * @author Sean A. Irvine
 */
public interface UserLevelProc {

  /**
   * User level procedure
   * @param lab labels
   * @param ptn partition
   * @param lev level
   * @param orbits the orbits
   * @param stats statistics
   * @param e tv value
   * @param f index
   * @param g cell size
   * @param nc number of cells
   * @param children number of children
   * @param n number of vertices
   */
  void userLevelProc(int[] lab, int[] ptn, int lev, int[] orbits, StatsBlk stats, int e, int f, int g, int nc, int children, int n);
}
