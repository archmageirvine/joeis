package irvine.oeis.a000;

/**
 * A000436 Generalized Euler numbers c(3,n).
 * @author Sean A. Irvine
 */
public class A000436 extends A000233 {

  /** Construct the sequence. */
  public A000436() {
    super(0);
  }

  @Override
  protected int getA() {
    return 3;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
