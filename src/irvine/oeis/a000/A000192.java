package irvine.oeis.a000;

/**
 * A000192 Generalized Euler numbers c(6,n).
 * @author Sean A. Irvine
 */
public class A000192 extends A000233 {

  /** Construct the sequence. */
  public A000192() {
    super(0);
  }

  @Override
  protected int getA() {
    return 6;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
