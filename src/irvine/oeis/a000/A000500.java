package irvine.oeis.a000;

/**
 * A000500 Number of permutations of an n-sequence discordant with three given permutations (see reference) in n-7 places.
 * @author Sean A. Irvine
 */
public class A000500 extends A000380 {

  /** Construct the sequence. */
  public A000500() {
    super(7);
  }

  @Override
  protected int coeff() {
    return 7;
  }
}
