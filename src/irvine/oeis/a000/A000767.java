package irvine.oeis.a000;

/**
 * A000767 Number of n-step self-avoiding walks on f.c.c. lattice ending at point with x = 2.
 * @author Sean A. Irvine
 */
public class A000767 extends A000766 {

  {
    super.next();
  }

  @Override
  protected int xPos() {
    return 2;
  }
}
