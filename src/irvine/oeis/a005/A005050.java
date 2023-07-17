package irvine.oeis.a005;

/**
 * A005050 Minimal span of set of n elements with no 6-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005050 extends A005048 {

  /** Construct the sequence. */
  public A005050() {
    super(6);
  }

  @Override
  protected int getProgressionLength() {
    return 6;
  }
}

