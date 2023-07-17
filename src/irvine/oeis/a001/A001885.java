package irvine.oeis.a001;

/**
 * A001885 Hit polynomials.
 * @author Sean A. Irvine
 */
public class A001885 extends A001884 {

  /** Construct the sequence. */
  public A001885() {
    super(2);
  }

  @Override
  protected int coeff() {
    return 2;
  }
}
