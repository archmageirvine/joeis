package irvine.oeis.a015;

/**
 * A015639 Number of ordered quadruples of integers from [ 2,n ] with no common factors between triples.
 * @author Sean A. Irvine
 */
public class A015639 extends A015635 {

  /** Construct the sequence. */
  public A015639() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
