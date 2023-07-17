package irvine.oeis.a005;

/**
 * A005049 Minimal span of set of n elements with no 5-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005049 extends A005048 {

  /** Construct the sequence. */
  public A005049() {
    super(5);
  }

  @Override
  protected int getProgressionLength() {
    return 5;
  }
}

