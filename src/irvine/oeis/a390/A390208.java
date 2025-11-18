package irvine.oeis.a390;

/**
 * A390208 allocated for Thomas Hutton.
 * @author Sean A. Irvine
 */
public class A390208 extends A390217 {

  /** Construct the sequence. */
  public A390208() {
    super(3);
  }

  protected boolean accept(final int sum) {
    return (sum % mColours) == 1;
  }
}
