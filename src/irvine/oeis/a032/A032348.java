package irvine.oeis.a032;

/**
 * A032348 Coefficients of Jacobi function c(3,m).
 * @author Sean A. Irvine
 */
public class A032348 extends A032428 {

  /** Construct the sequence. */
  public A032348() {
    super(0);
  }

  @Override
  protected int j() {
    return 3;
  }
}
