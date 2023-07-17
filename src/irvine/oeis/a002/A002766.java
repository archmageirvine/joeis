package irvine.oeis.a002;

/**
 * A002766 Number of bipartite partitions.
 * @author Sean A. Irvine
 */
public class A002766 extends A002762 {

  /** Construct the sequence. */
  public A002766() {
    super(1);
  }

  @Override
  protected int m() {
    return 9;
  }

  @Override
  protected int k() {
    return 3;
  }
}
