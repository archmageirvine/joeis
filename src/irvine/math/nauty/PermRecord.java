package irvine.math.nauty;

/**
 * Permutation record.
 * @author Sean A. Irvine
 */
public class PermRecord {
  PermRecord mPtr;   /* general-purpose pointer */
  int[] mP;          /* extendable section */

  PermRecord(final int n) {
    mP = new int[n];
  }
}
