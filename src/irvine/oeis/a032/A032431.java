package irvine.oeis.a032;

/**
 * A032431 Coefficients of Jacobi elliptic function c(8,m).
 * @author Sean A. Irvine
 */
public class A032431 extends A032428 {

  /** Construct the sequence. */
  public A032431() {
    super(8);
  }

  @Override
  protected int j() {
    return 8;
  }
}
