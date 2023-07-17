package irvine.oeis.a015;

/**
 * A015699 Number of 5-tuples of different integers from [ 2,n ] with no common factors among pairs.
 * @author Sean A. Irvine
 */
public class A015699 extends A015698 {

  /** Construct the sequence. */
  public A015699() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
