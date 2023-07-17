package irvine.oeis.a032;

/**
 * A032433 Coefficients of Jacobi elliptic function c(10,m).
 * @author Sean A. Irvine
 */
public class A032433 extends A032428 {

  /** Construct the sequence. */
  public A032433() {
    super(10);
  }

  @Override
  protected int j() {
    return 10;
  }
}
