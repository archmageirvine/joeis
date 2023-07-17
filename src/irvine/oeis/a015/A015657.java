package irvine.oeis.a015;

/**
 * A015657 Number of ordered 5-tuples of integers from [ 2,n ] with no common factors among triples.
 * @author Sean A. Irvine
 */
public class A015657 extends A015656 {

  /** Construct the sequence. */
  public A015657() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
