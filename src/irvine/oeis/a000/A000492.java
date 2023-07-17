package irvine.oeis.a000;

/**
 * A000492 Number of permutations of an n-sequence discordant with three given permutations (see reference) in n-6 places.
 * @author Sean A. Irvine
 */
public class A000492 extends A000380 {

  /** Construct the sequence. */
  public A000492() {
    super(6);
  }

  @Override
  protected int coeff() {
    return 6;
  }
}
