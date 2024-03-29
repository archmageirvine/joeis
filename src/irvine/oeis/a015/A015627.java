package irvine.oeis.a015;

/**
 * A015627 Quadruples of different integers from [ 2,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015627 extends A015622 {

  /** Construct the sequence. */
  public A015627() {
    super(2);
  }

  @Override
  protected long start() {
    return 2;
  }
}
