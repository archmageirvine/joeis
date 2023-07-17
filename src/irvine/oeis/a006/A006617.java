package irvine.oeis.a006;

/**
 * A006617 Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A006617 extends A006613 {

  /** Construct the sequence. */
  public A006617() {
    super(2);
  }

  @Override
  protected int cols() {
    return mN + 1;
  }

  @Override
  protected int init() {
    return 1;
  }
}

