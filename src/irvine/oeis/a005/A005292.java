package irvine.oeis.a005;

/**
 * A005292 Representation degeneracies for boson strings.
 * @author Sean A. Irvine
 */
public class A005292 extends A005290 {

  /** Construct the sequence. */
  public A005292() {
    super(2);
  }

  @Override
  protected int degree() {
    return 2;
  }
}
