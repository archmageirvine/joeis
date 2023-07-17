package irvine.oeis.a015;

/**
 * A015629 Quadruples of different integers from [ 2,n ] with no common factors between triples.
 * @author Sean A. Irvine
 */
public class A015629 extends A015625 {

  /** Construct the sequence. */
  public A015629() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
