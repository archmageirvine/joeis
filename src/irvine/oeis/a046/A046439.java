package irvine.oeis.a046;

/**
 * A046439 9 steps needed to reach a prime under "Sum of digits raised to its digits' powers" procedure.
 * @author Sean A. Irvine
 */
public class A046439 extends A046432 {

  /** Construct the sequence. */
  public A046439() {
    super(0);
  }

  @Override
  protected int steps() {
    return 9;
  }
}
