package irvine.oeis.a015;

/**
 * A015638 Number of ordered quadruples of integers from [ 2,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015638 extends A015634 {

  /** Construct the sequence. */
  public A015638() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
