package irvine.oeis.a000;

/**
 * A000401 Numbers of form x^2 + y^2 + 2z^2.
 * @author Sean A. Irvine
 */
public class A000401 extends A000394 {

  /** Construct the sequence. */
  public A000401() {
    super(1);
  }

  @Override
  protected int multiplier() {
    return 2;
  }
}

