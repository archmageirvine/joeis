package irvine.oeis.a006;

/**
 * A006623 Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A006623 extends A006613 {

  /** Construct the sequence. */
  public A006623() {
    super(4);
  }

  @Override
  protected int cols() {
    return mN - 1;
  }

  @Override
  protected int init() {
    return 3;
  }
}

