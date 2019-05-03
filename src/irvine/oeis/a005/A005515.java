package irvine.oeis.a005;

/**
 * A005515 Number of n-bead bracelets (turnover necklaces) of two colors with 10 red beads and <code>n-10</code> black beads.
 * @author Sean A. Irvine
 */
public class A005515 extends A005516 {

  @Override
  protected int beads() {
    return 10;
  }
}
