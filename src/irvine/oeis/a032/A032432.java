package irvine.oeis.a032;

/**
 * A032432 Coefficients of Jacobi elliptic function c(9,m).
 * @author Sean A. Irvine
 */
public class A032432 extends A032428 {

  /** Construct the sequence. */
  public A032432() {
    super(9);
  }

  @Override
  protected int j() {
    return 9;
  }
}
