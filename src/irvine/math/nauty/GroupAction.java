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
   * @param abort abort status
   */
  void groupAction(final int[] p, final int pos, final int n, final int[] abort);

}
