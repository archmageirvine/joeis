package irvine.oeis.a001;

/**
 * A001886 Hit polynomials.
 * @author Sean A. Irvine
 */
public class A001886 extends A001884 {

  /** Construct the sequence. */
  public A001886() {
    super(3);
  }

  @Override
  protected int coeff() {
    return 3;
  }
}
