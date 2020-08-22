package irvine.oeis.a000;

/**
 * A000766 Number of n-step self-avoiding walks on f.c.c. lattice ending at point with x = 1.
 * @author Sean A. Irvine
 */
public class A000766 extends A000765 {

  {
    super.next();
  }

  @Override
  protected long targetX() {
    return 1;
  }
}
