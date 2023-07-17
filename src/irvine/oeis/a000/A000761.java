package irvine.oeis.a000;

/**
 * A000761 Number of n-step self-avoiding walks on cubic lattice ending at point with x=2.
 * @author Sean A. Irvine
 */
public class A000761 extends A000759 {

  /** Construct the sequence. */
  public A000761() {
    super(2);
  }

  {
    super.next();
    super.next();
  }

  @Override
  protected long targetX() {
    return 2;
  }
}
