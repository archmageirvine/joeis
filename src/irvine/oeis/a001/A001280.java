package irvine.oeis.a001;

/**
 * A001280 Number of permutations of length n by rises.
 * @author Sean A. Irvine
 */
public class A001280 extends A001278 {

  /** Construct the sequence. */
  public A001280() {
    super(8);
  }

  @Override
  protected int order() {
    return 4;
  }
}
