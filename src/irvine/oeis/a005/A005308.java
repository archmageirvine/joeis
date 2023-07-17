package irvine.oeis.a005;

/**
 * A005308 Bosonic string states.
 * @author Sean A. Irvine
 */
public class A005308 extends A005303 {

  /** Construct the sequence. */
  public A005308() {
    super(1);
  }

  @Override
  protected int power(final int n) {
    return n <= 1 ? 0 : (n - 2) / 2;
  }
}
