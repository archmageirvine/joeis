package irvine.oeis.a005;

/**
 * A005514 Number of n-bead bracelets (turnover necklaces) with 8 red beads and n-8 black beads.
 * @author Sean A. Irvine
 */
public class A005514 extends A005516 {

  /** Construct the sequence. */
  public A005514() {
    super(8);
  }

  @Override
  protected int beads() {
    return 8;
  }
}
