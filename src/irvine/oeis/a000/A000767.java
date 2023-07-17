package irvine.oeis.a000;

/**
 * A000767 Number of n-step self-avoiding walks on f.c.c. lattice ending at point with x = 2.
 * @author Sean A. Irvine
 */
public class A000767 extends A000765 {

  /** Construct the sequence. */
  public A000767() {
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
