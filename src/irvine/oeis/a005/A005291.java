package irvine.oeis.a005;

/**
 * A005291 Representation degeneracies for boson strings.
 * @author Sean A. Irvine
 */
public class A005291 extends A005290 {

  /** Construct the sequence. */
  public A005291() {
    super(1);
  }

  @Override
  protected int degree() {
    return 1;
  }
}
