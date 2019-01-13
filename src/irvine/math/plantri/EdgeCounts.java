package irvine.math.plantri;

/**
 * Routines to compute the number of edges in a graph of various types.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class EdgeCounts {

  private EdgeCounts() { }

  static int star3(final int n) {
    return 6 + (n << 3);
  }

  static int star4(final int n) {
    return 6 + 8 * Plantri.MAX_VERTICES + (n << 3);
  }

  static int star5(final int n) {
    return 6 + 16 * Plantri.MAX_VERTICES + (n << 4);
  }

  /* edges - 300 + 30*MAX_VERTICES + 40*(n) - 12*40 */
  static int quadrP0(final int n) {
    return 4 * Plantri.MAX_VERTICES + 4 * n - 8;
  }

  /* The smallest n for which it is called is 3. Then it should start at entry
     edges +4 + 4*MAX_VERTICES -- right AFTER the edges for quadrP1(n) which is
     used in the same run. */
  static int quadrP1(final int n) {
    return 4 + 4 * n;
  }

  /* edges + 24 + 4*(n) - 5*4 since the smallest n for which it is possibly
     called is n=5  and then it should start at edge 24 */
  static int quadrP2(final int n) {
    return 4 * Plantri.MAX_VERTICES + 8 * n - 60;
  }

  /* edges +4 + 4*MAX_VERTICES + 8*(n) - 8*8, again since the smallest
     possible n is 8 */
  static int quadrP3(final int n) {
    return 12 * Plantri.MAX_VERTICES + 16 * n - 128;
  }

  static int fourOp(final int n) {
    return 6 * n;
  }

  static int fiveOp(final int n) {
    return 6 * Plantri.MAX_VERTICES + 6 * n;
  }

  static int sOp(final int n) {
    return 12 * Plantri.MAX_VERTICES + 18 * n;
  }

  /* edges + 60 + 6*(n) - 12*6 since the smallest n for which it is possibly
     called is n=12 and then it should mStart at edge 60 */
  static int min5B0(final int n) {
    return 6 * Plantri.MAX_VERTICES + 12 * n - 156;
  }

  static int min5A(final int n) {
    return 6 * n - 12;
  }

  /* edges - 12 + 6*MAX_VERTICES + 12*(n) - 12*12, again since the smallest
     possible n is 12 */
  static int min5B1(final int n) {
    return 18 * Plantri.MAX_VERTICES + 12 * n - 300;
  }

  /* edges - 156 + 18*MAX_VERTICES + 12*(n) - 12*12 */
  static int min5C(final int n) {
    return 30 * Plantri.MAX_VERTICES + 40 * n - 780;
  }

  static int pOp(final int n) {
    return 24 + 12 * n;
  }

  static int qOp(final int n) {
    return 24 + 12 * Plantri.MAX_VERTICES + 6 * n;
  }

}
