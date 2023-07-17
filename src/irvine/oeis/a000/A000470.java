package irvine.oeis.a000;

/**
 * A000470 Number of permutations of an n-sequence discordant with three given permutations (see reference) in n-5 places.
 * @author Sean A. Irvine
 */
public class A000470 extends A000380 {

  /** Construct the sequence. */
  public A000470() {
    super(5);
  }

  @Override
  protected int coeff() {
    return 5;
  }
}
