package irvine.math.nauty;

/**
 * Group action.
 * @author Sean A. Irvine
 */
public interface GroupAction {

  /**
   * Perform group action
   * @param p permutation
   * @param pos position within permutation
   * @param n number of vertices
   * @return true if the computation should be aborted.
   */
  boolean groupAction(final int[] p, final int pos, final int n);

}
