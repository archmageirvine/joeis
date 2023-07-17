package irvine.oeis.a015;

/**
 * A015641 Number of 5-tuples of different integers from [ 2,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015641 extends A015640 {

  /** Construct the sequence. */
  public A015641() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
