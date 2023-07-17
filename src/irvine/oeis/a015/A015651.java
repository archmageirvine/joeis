package irvine.oeis.a015;

/**
 * A015651 Number of ordered 5-tuples of integers from [ 2,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015651 extends A015650 {

  /** Construct the sequence. */
  public A015651() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
