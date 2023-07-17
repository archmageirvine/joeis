package irvine.oeis.a015;

/**
 * A015628 Quadruples of different integers from [ 2,n ] with no common factors between pairs.
 * @author Sean A. Irvine
 */
public class A015628 extends A015623 {

  /** Construct the sequence. */
  public A015628() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
