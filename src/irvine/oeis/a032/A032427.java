package irvine.oeis.a032;

/**
 * A032427 Coefficients of Jacobi elliptic function c(4,m).
 * @author Sean A. Irvine
 */
public class A032427 extends A032428 {

  /** Construct the sequence. */
  public A032427() {
    super(0);
  }

  @Override
  protected int j() {
    return 4;
  }
}
