package irvine.oeis.a001;

/**
 * A001279 Number of permutations of length n by rises.
 * @author Sean A. Irvine
 */
public class A001279 extends A001278 {

  /** Construct the sequence. */
  public A001279() {
    super(6);
  }

  @Override
  protected int order() {
    return 3;
  }
}
